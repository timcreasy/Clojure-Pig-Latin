(ns pig.core
  (:gen-class))

(require '[clojure.string :as str])

(defn pigify-word
  [word]
  (str/lower-case
    (str/join ""
      (concat (rest word) [(first word) "ay"])
    )
  )
)

(defn pigify-text
  [input]
  (println
    (str/capitalize 
      (str/join " " (mapv pigify-word (str/split input #" ")))
    )
  )
)

(defn -main
  []
  (pigify-text "The quick brown fox")
)