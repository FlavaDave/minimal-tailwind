(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))


(defn app []
  [:div.bg-gray-500.h-screen
   [:div.flex.justify-center
    [:h1.mt-5.text-white "Minimal tailwind website!"]]
   [:div.justify-center.flex.flex-row
    [:button.bg-black.text-white.py-2.px-3.mx-2.rounded-lg "row"]
    [:button.bg-black.text-white.py-2.px-3.mx-2.rounded-lg "of"]
    [:button.bg-black.text-white.py-2.px-3.mx-2.rounded-lg "buttons"]]])

(defn mount! []
  (rdom/render [app]
                  (.getElementById js/document "app")))

(defn main! []
  (mount!))