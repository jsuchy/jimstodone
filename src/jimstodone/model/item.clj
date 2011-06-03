(ns jimstodone.model.item
  (:require
    [appengine.datastore :as ds]))

  (defn save [item]
    (ds/save-entity item))

  (ds/defentity Item []
    [[contents]])
