```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item $index: $item"
    if (item == "someValue") {
      list.remove(item) // This will cause a ConcurrentModificationException
    }
  }
}

List<String> myList = ["one", "two", "someValue", "four"]
myMethod(myList)
```