(def +project+ 'miraj.polymer/assets)
(def +version+ "1.8.1-SNAPSHOT")

(set-env!
 :asset-paths #{"resources"}

 :repositories #(conj % ["clojars" {:url "https://clojars.org/repo/"}])

 :dependencies   '[[org.clojure/clojure RELEASE]])

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
