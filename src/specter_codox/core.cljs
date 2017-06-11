(ns specter-codox.core
  (:require [com.rpl.specter :as s :include-macros true]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(s/setval s/END [:a] [])
