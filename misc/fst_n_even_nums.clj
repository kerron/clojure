;; take the first 10 even numbers from a lazy sequence
(defn fst-n-even-nums [n]
  (->> (range)
       (filter even?)
       (take n)))

(fst-n-even-nums 20) ;; => (0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38)
