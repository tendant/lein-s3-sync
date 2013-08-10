(defproject lein-s3-sync "0.1.0-SNAPSHOT"
  :description "Sync local folders to s3"
  :url "http://github.com/kanej/lein-s3-sync"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[clj-aws-s3 "0.3.6"]
                 [pandect "0.3.0"]]
  :test-selectors {:default (complement :integration)
                   :integration :integration
                   :all (constantly true)}
  :eval-in-leiningen true
  :min-lein-version "2.0.0")
