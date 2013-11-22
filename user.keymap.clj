{:+ {
  :editor.clj {"pmeta-`" [(:eval.custom
    "(defmacro escape-string
       [& somestrings]
       (apply str
         (for [string somestrings]
           (if (instance? String string)
             (str \"\\\"\" string \"\\\"\")
             (str string)))))"
    {:result-type :replace :verbatim true})]}}
 }