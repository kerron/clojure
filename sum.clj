(ns Sum)

(defn sum
  "Write a method sum that takes an array of numbers 
  and returns the sum of the numbers. These may be integers 
  or decimals for Ruby and any instance of Num for Haskell. 
  The numbers can also be negative. If the array does
  not contain any numbers then you should return 0."
  [a]
  (reduce + a))

(sum [1 2 3 4 5]) ;; => 15
