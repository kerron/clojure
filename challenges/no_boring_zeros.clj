(ns challenges.no-boring-zeros)
;; https://www.codewars.com/kata/570a6a46455d08ff8d001002/clojure
;; remove the last digit if it is zero, and return zero if the number has only one digit and it's zero

(defn no-boring-zeros [n]
  (cond (= n 0) 0
        (= (mod n 10) 0) (no-boring-zeros (quot n 10))
        :else n))
