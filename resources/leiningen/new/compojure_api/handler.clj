(ns {{name}}.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [schema.core :as s]))

(s/defschema Message {:message String})

(def app
  (api
   {:swagger
    {:ui "/"
     :spec "/swagger.json"
     :data {:info {:title "{{name-camel}}"
                   :description "Compojure Api example"}
            :tags [{:name "hello", :description "says hello in Finnish"}]}}}
   (context "/hello" []
     :tags ["hello"]
     (GET "/" []
       :return Message
       :query-params [name :- String]
       :summary "say hello"
       (ok {:message (str "Terve, " name)})))))
