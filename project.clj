(defproject org.clojars.sergeyminaev/clj-json-patch "0.1.7"
  :description "Clojure implementation of http://tools.ietf.org/html/rfc6902"
  :url "https://github.com/sergeyminaev/clj-json-patch"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main clj-json-patch.core
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cheshire "5.8.0"]]
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :profiles {:dev {:dependencies [[midje/midje "1.9.5"]]
                   :plugins [[lein-midje "3.2.1"]]}})
