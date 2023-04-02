(ns challenges.string-repeat)

(defn repeat-str [n s]
  (apply str (repeat n s)))

(print (repeat-str 4 "hello"))
