# Groovy ConcurrentModificationException in eachWithIndex

This repository demonstrates a common error in Groovy when using the `eachWithIndex` iterator with list modification inside the loop.  Attempting to remove items from a list while iterating over it using `eachWithIndex` results in a `ConcurrentModificationException`.

The `bug.groovy` file shows the problematic code. The `bugSolution.groovy` file provides a solution using an iterator or copying to a new list.