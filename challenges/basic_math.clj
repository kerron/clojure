(ns challenges.basic-math)

;;  https://www.codewars.com/kata/57356c55867b9b7a60000bd7
;;  Your task is to create a function that does four basic mathematical operations.
;;  The function should take three arguments - operation(string/char), value1(number), value2(number).
;;  The function should return result of numbers after applying the chosen operation

(defn basic-math [op value1 value2]
  (cond
    (= op \+) (+ value1 value2)
    (= op \-) (- value1 value2)
    (= op \*) (* value1 value2)
    (= op \/) (/ value1 value2)
    :else (throw (ex-info "Invalid operator" {}))))

(basic-math \+ 1 2) ;; => 3
