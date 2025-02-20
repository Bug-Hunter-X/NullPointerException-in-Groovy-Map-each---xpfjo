```groovy
def myMethod(Map params) {
  if (params) { //Check for null before iterating
    params.each { key, value ->
      println "Key: $key, Value: $value"
    }
  } else {
    println "Params map is null"
  }
}

myMethod(null)
```