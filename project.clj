(defproject specter-codox "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.562"]
                 [com.rpl/specter "1.0.1"]
                 [codox "0.10.3"]]
  :main ^:skip-aot specter-codox.core
  :target-path "target/%s"
  :codox {:language :clojurescript}
  :plugins [[lein-codox "0.10.3"]
            [lein-cljsbuild "1.1.6"]]
  :cljsbuild {:builds [{:source-paths ["src"]}]}
  :profiles {:uberjar {:aot :all}})
