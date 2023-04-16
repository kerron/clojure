(ns unique-number)

(defn unique-number [xs]
  (->> xs
       frequencies
       (filter #(= 1 (val %)))
       first
       key))

(unique-number [1 2 2 3 3]) ; => 1
