(ns brave-clojure.core
  (:gen-class))


(defn add-100 [num]
  (+ num 100))


(defn dec-maker [num]
  (fn [x]
    (- x num))
  )

(defn mapset [f vec]
  (map f (set vec))
  )
