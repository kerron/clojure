;; most common words in English
(def common-word 
  (-> (slurp "https://www.textfixer.com/tutorials/common-english-words.txt")
      (clojure.string/split #",")
      set))


;; save book in a variable
(def book 
  (slurp "https://raw.githubusercontent.com/jraleman/42_get_next_line/master/tests/hhgttg.txt"))


(def words (re-seq #"[\w|']+" book))
;; => ("The" "Hitch" "Hiker's" "Guide" "to" "the" "Galaxy"...) 


;; 4 most frequently used words
(defn most-common-words [text] 
  (->> text
    (map clojure.string/lower-case)
    (remove common-word)
    frequencies
    (sort-by val)
    (take-last 4)
    reverse))

(most-common-words words)
;; => (["arthur" 332] ["ford" 316] ["zaphod" 206] ["up" 180])


;; 4 longest words
(defn longest-words [text] 
  (->> words 
     (distinct)
     (sort-by count)
     (take-last 4)
     (group-by count)
     reverse))


(longest-words words)
;; => ([43 ["Nnnnnnnnnnyyyyyyyuuuuuuurrrrrrrggggggghhhhh"]] 
       ;;[29 ["Eerrrrrrmmmmmmmmmmmmmmmmmmmmm"]] 
       ;;[20 ["Huhhhhgggggggnnnnnnn" 
       ;;[19 ["Aaaaaaarggggghhhhhh"]])

;; typical clojure expression
(clojure.walk/macroexpand-all '(->> book 
                                    (re-seq #"[\w|']+") 
                                    (map #(clojure.string/lower-case %))
                                    (remove common-word) 
                                    frequencies 
                                    (sort-by val) 
                                    reverse))
;; (reverse (sort-by val (frequencies (remove common-word (map (fn* [%1] (clojure.string/lower-case %1)) (re-seq #"[\w|']+" book))))))

