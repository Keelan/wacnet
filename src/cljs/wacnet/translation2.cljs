(ns wacnet.translation2
  (:require-macros [taoensso.tower.cljs-macros :as tower-macros :refer (with-tscope)])
  (:require [taoensso.tower :as tower]
            [hvacio-ui.translation :as t]))


;; for locale, use the hvacio-ui.translation/locale atom.

(def locale t/locale)

;;;;; translation
(def ^:private tconfig
  {:fallback-locale :en
   ;; Inlined (macro) dict => this ns needs rebuild for dict changes to reflect:
   :compiled-dictionary (tower-macros/dict-compile "translation.edn")})

(def t (tower/make-t tconfig)) ; Create translation fn