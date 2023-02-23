;; (1 + 3 * 4 - 5)
;; (* (+ 1 3) (- 4 5))

(defmacro do-calc
  [form]
  (-> (list (nth form 3) (nth form 2) (nth form 4))
      (list (nth form 1) (nth form 0))
      (list (nth form 5) (nth form 6))))

(do-calc (1 + 3 * 4 - 5))

(* (+ 1 3) (- 4 5))
