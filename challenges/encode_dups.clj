(ns challenges.encode-dups
  (:require [clojure.string :as str]))
;; https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/clojure
;; The goal of this exercise is to convert a string to a
;; new string where each character in the new string is
;; "(" if that character appears only once in the original 
;; string, or ")" if that character appears more than 
;; once in the original string. Ignore capitalization 
;; when determining if a character is a duplicate.
;;
;; Examples
;; "din"      =>  "((("
;; "recede"   =>  "()()()"
;; "Success"  =>  ")())())"
;; "(( @"     =>  "))((" 

(defn encode-dups [input]
  (let [freq-map (->> input
                      str/lower-case
                      frequencies)
        lwr-input (str/lower-case input)]
    (->> lwr-input
         (map #(if (> (get freq-map %) 1) ")" "("))
         (str/join))))

(encode-dups "kerron") ;; => "(())(("
