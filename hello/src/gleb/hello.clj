(ns gleb.hello
  (:gen-class))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello3, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))

(defn -summ
  []
  (+ 1 2 4))

(if true
  (+ 2 5)
"By Aquaman's trident!")

(def ^:private zeus-hammer
  "By Zeus's hammer!")

(defn -ifbranching
  []
  (if false
  (do (println "Success!")
      zeus-hammer)
  (do (println "Failure!")
      "By Aquaman's trident!")))

(if false
  "That won't be returned")
; => nil

(nil? 1)

(nil? nil)

(= 1 2)
; => false
;
(or (= 0 1) (= "yes" "no"))

(def failed-protagonist-names
["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])
