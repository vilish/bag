(ns buyme-aggregation-backend.conf
  (:require [mount.core :refer [defstate]]
            [taoensso.timbre :refer [info]]
            [environ.core :refer [env]]))

(def config env)
;(defstate config
;          :start env
;          :stop {})