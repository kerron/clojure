; https://www.codewars.com/kata/55f2b110f61eb01779000053
; Given two integers a and b, which can be positive or negative, 
; find the sum of all the integers between and including them and return it. 
; If the two numbers are equal return a or b.
; Note: a and b are not ordered!

(defn get-sum [a b]
  (apply + (range (min a b) (inc (max a b)))))

(get-sum 10 1) ;; => 55
