(ns brave-clojure.core-test
  (:require [clojure.test :refer :all]
            [brave-clojure.core :refer :all]))


(deftest chapter-3-question-1
  (testing "use-str"
    (is (= "123" (str 1 2 3))))
  (testing "use-vector"
    (is (= [1 2 3] (vector 1 2 3))))
  (testing "use-list"
    (is (= '(1 2 3) (list 1 2 3))))
  (testing "use-hash-map"
    (is (= {:a 1 :b 2 :c 3} (hash-map :a 1 :b 2 :c 3))))
  (testing "hash-set"
    (is (= #{1 2 3} (hash-set 1 2 3 1 2 3))))
  )


(deftest chapter-3-question-2
         (testing "add-100"
                  (is (= 205 (add-100 105)))))

(deftest chapter-3-question-3
  (testing "dec-maker"
    (let [dec9 (dec-maker 9)]
      (is (= 1 (dec9 10))))
    )
  )

(deftest chapter-3-question-4
  (testing "mapset"
    (is (= #{2 3} (mapset inc [1 1 2 2])))))