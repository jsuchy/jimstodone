(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "jimstodone"]
  (include-css "/stylesheets/jimstodone.css")
  (include-js "/javascript/jimstodone.js")]
 [:body
  (eval (:template-body gaeshi.views/*view-context*))
]]