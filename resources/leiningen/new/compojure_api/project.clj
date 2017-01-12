(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.10"]]
  :ring {:handler {{name}}.handler/app}
  :uberjar-name "server.jar"
  :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]{{{gen-test-deps}}}{{{midje-deps}}}]
                   :plugins [[lein-ring "0.10.0"]{{{midje-plugs}}}]}})
