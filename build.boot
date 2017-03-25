(def +project+ 'miraj.polymer/assets)
(def +version+ "2.0.0-RC-3")

(set-env!
 :asset-paths #{"resources"}

 ;; :checkouts '[[miraj/core "0.1.0-SNAPSHOT"]
 ;;              [miraj/co-dom "0.1.0-SNAPSHOT"]
 ;;              [miraj/boot-miraj "0.1.0-SNAPSHOT"]]

 :dependencies   '[;; [org.clojure/clojure RELEASE :scope "provided"]
                   ;; [miraj/co-dom "0.1.0-SNAPSHOT"]
                   ;; [miraj/core "0.1.0-SNAPSHOT" :scope "test"]

                   ;; ;; for demos and testing
                   ;; [miraj/html "5.1.0-SNAPSHOT"]

                   ;; [org.clojure/clojurescript "1.9.473" :scope "test"]
                   ;; [hipo "0.5.2" :scope "test"]
                   ;; [adzerk/boot-cljs "2.0.0-OUTPUTFIX" :scope "test"]
                   ;; [adzerk/boot-cljs-repl   "0.3.3" :scope "test"] ;; latest release
                   ;; [adzerk/boot-reload "0.5.1" :scope "test"] ;; cljs
                   ;; [samestep/boot-refresh "0.1.0" :scope "test"] ;; clj reloading
                   ;; [com.cemerick/piggieback "0.2.1"  :scope "test"]
                   ;; [weasel                  "0.7.0"  :scope "test"]
                   ;; ;; [org.clojure/tools.nrepl "0.2.12" :scope "test"]

                   ;; [miraj.polymer/iron "1.2.3-SNAPSHOT" :scope "test"]
                   ;; [pandeiro/boot-http "0.7.3" :scope "test"]

                   ;; [boot/boot "RELEASE" :scope "test"]
                   ;; [miraj/boot-miraj "0.1.0-SNAPSHOT" :scope "test"]
                   ;; [adzerk/boot-test "1.0.7" :scope "test"]
                   ])

#_(require '[miraj.boot-miraj :as miraj]
         '[adzerk.boot-cljs      :refer [cljs]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-test :refer [test]]
         '[samestep.boot-refresh :refer [refresh]]
         '[pandeiro.boot-http :as http :refer :all]
         '[boot.task.built-in :as boot :refer :all])

(task-options!
 pom  {:project     +project+
       :version     +version+
       :description "Miraj Polymer Assets"
       :url "https://github.com/mobileink/miraj-project/polymer-assets"
       :scm         {:url "https://github.com/miraj-project/miraj.core.git"}
       :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})

(deftask install-local
  "Build and install component libraries"
  []
  (comp (pom)
        (jar)
        (target)
        (install)))
