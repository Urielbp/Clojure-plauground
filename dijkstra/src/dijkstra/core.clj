(ns dijkstra.core
  (:gen-class))
(use '[dijkstra.data-structures.priority-heap :as heap])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (heap/greet '(1 2 3 4)))

(-main)