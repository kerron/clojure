(ns challenges.remove-url-anchor
  (:require [clojure.string :as str]))

(defn remove-url-anchor [s]
  (-> s
      (clojure.string/split #"#")
      first))

(remove-url-anchor "hello world#can't touch this") ;; => "hello world"
