(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "A series of zombie-themed games written with Clojure and ClojureScript."
  :url
  :license {:name "GNU General Public License"
             :url "http://www.gnu.org/licenses/gpl.html"}
  :jvm-opts ["-XX:MaxPermSize=256m"]
  :main undead.system
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.18"]])
   :profiles {:dev {:plugins []
                   :dependencies []
                   :source-paths ["dev"]}})
