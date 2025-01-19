```groovy
def myMethod(List<String> list) {
  // Solution 1: Using an iterator
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String item = iterator.next()
    println "Item: $item"
    if (item == "someValue") {
      iterator.remove()
    }
  }

  // Solution 2: Creating a copy for modification
  def newList = []
  list.each {item ->
    println "Item: $item"
      if(item != "someValue") newList << item
  }
  println newList
  list.clear()
  list.addAll(newList)

}

List<String> myList = ["one", "two", "someValue", "four"]
myMethod(myList)
println myList
```