[:div {:id "content" :style "text-align: center;"}
 [:h1 "Doin' it Live"]
]

[:div {:id "placeholder" :style "display:block; text-align: center"}
 [:h3 "Wait for it..."]
]

[:div {:id "bill" :style "display:none;"}
 [:object {:style "height: 390px; width: 640px"}
  [:embed {:src "http://www.youtube.com/v/zIcx_rxTstc?version=3&autoplay=1&rel=0" :type "application/x-shockwave-flash" :allowfullscreen "true" :allowScriptAccess "always" :width "640" :height "390"}]
 ]
]

(javascript-tag
  "var t = setTimeout(\"document.getElementById('placeholder').style.display = 'none';document.getElementById('bill').style.display = 'block';\", 3000);")