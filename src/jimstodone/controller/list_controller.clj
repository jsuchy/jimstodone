(ns jimstodone.controller.list-controller
  (:use
    [compojure.core]
    [ring.util.response :only (redirect)]
    [gaeshi.views :only (render-template)]
    [jimstodone.model.item :only (save item find-items)]
    [gaeshi.middleware.request :only (*request*)] 
  )
)

(defn- process-new-item-form []
  (save (item (:params *request*)))
  (redirect "/list/index")
)

(defn- show-index []
  (render-template "list/index" :items (find-items)))

(def list-controller
  (->
    (routes
      (GET "/list" [] (show-index))
      (GET "/list/" [] (show-index))
      (GET "/list/index" [] (show-index))
      (POST "/list/new_item" [] (process-new-item-form)))))
