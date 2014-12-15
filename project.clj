(defproject fondo "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [org.clojure/data.codec "0.1.0"]
                 [com.amazonaws/aws-java-sdk "1.9.10" :exclusions [joda-time]]
                 [com.cognitect/transit-clj "0.8.259"]
                 [ring/ring-core "1.3.1"
                  :exclusions [commons-codec]]
                 [ring/ring-jetty-adapter "1.3.1"]
                 [ring/ring-json "0.3.1"]
                 [cheshire "5.4.0"]]
  :plugins [[lein-ring "0.8.11"
             :exclusions [org.clojure/clojure
                          org.clojure/data.xml]]]
  :ring {:handler fondo.core/node-app}
  :profiles
  {:dev
   {:dependencies [[org.clojure/tools.namespace "0.2.7"]]
    :source-paths ["dev"]}})