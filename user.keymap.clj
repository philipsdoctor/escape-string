{:+ {
  :editor.clj {"pmeta-`" [(:eval.custom
               "(do (defmacro escape-string
                    [& somestrings]
                    (apply str
                      (for [string somestrings]
                        (if (instance? String string)
                          (str \"\\\"\" string \"\\\"\")
                          (str \"\\\"\" string \"\\\"\")))))
                    (escape-string __SELECTION__))"
    {:result-type :replace :verbatim true})]}}
 }