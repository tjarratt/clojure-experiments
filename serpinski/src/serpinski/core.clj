(ns serpinski.core
  (:gen-class))

;; Serpinski helpers ahoy
(defn draw-pyramid []
  (material 0.8 0.2 0.2 1)

  ;; draw the four sides of the pyramid
  (draw-triangle-fan
   (vertex 0 1 0)
   (dotimes [_ 5]
            (rotate 90 0 1 0)
            (normal 1 0.5 1)
            (vertex 0.5 0 0.5)))

  ;; draw the base of the pyramid
  (draw-quads
   (normal 0 -1 0)
   (dotimes [_ 4]
            (rotate -90 0 1 0)
            (vertex 0.5 0 0.5))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (draw-pyramid))
