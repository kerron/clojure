;; list comprehension
(for [number [1 2 3]] (* number 2))

;; map version of above
(map #(* % 2) [1 2 3])

;; multiple list
(for [a [1 2 3]
      b [:a :b :c]]
  (str a b))
;; 
(range 10)

;; list of combinations 
(for [r-1 (range 10)
      r-2 (range 10)
      r-3 (range 10)]
  [r-1 r-2 r-3])

;; at least one pair of the values must be the same number
(for [r-1 (range 10)
      r-2 (range 10)
      r-3 (range 10)
      :when (or
             (= r-1 r-2)
             (= r-2 r-3)
             (= r-3 r-1))]
  [r-1 r-2 r-3])
