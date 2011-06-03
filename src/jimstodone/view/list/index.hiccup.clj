[:div {:id "content" :style "text-align: center;"}
 [:h1 "This is my one and only list!"]
]

[:ul
 (for [item (:items *view-context*)] [:li (:contents item)])
]

[:form#new-item-form {:action "/list/new_item" :method "post"}
 [:input {:name "contents" :type "text"}]
 [:input {:type "submit"}]
]
