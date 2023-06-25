;; Digital root is the recursive sum of all the digits in a number.
;; Given n, take the sum of the digits of n.
;; If that value has more than one digit, continue reducing in this
;; way until a single-digit number is produced. The input will be a non-negative integer.
;; 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6

(ns digital-root)

(defn digital-root [n]
  (let [sum (reduce + (map #(Character/digit % 10) (str n)))]
    (if (> sum 9)
      (recur sum)
      sum)))
