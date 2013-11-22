

(defmacro escape-string
  [& somestrings]
  (apply str
  (for [string somestrings]
  (if (instance? String string)
    (str "\"" string "\"")
    (str string)))))

(escape-string "{"a" : "b"}")

"{""a"":""b""}"

"{"a":"b"}"

"{\"a\":\"b\"}"



