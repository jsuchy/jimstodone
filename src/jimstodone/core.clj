(ns jimstodone.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [gaeshi.middleware.view-context :only (wrap-view-context)]
    [gaeshi.views :only (render-template render-html)]
    [gaeshi.controllers :only (controller-router)]))

(defroutes jimstodone-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'jimstodone.controller)
  (not-found (render-template "not_found" :template-root "jimstodone/view" :ns `jimstodone.view.view-helpers)))

(def app-handler
  (->
    jimstodone-routes
    (wrap-view-context :template-root "jimstodone/view" :ns `jimstodone.view.view-helpers)))

