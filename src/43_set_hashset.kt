
/*
*   1. Set and HashSet
* */
fun main(args: Array<String>) {

    // "Set" contains unique elements
    // "HashSet" also contains unique elements but sequence is not guaranteed in output

    var mySet = mutableSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8)  // Mutable Set, READ and WRITE both
//    var mySet = hashSetOf<Int>( 2, 54, 3, 1, 0, 9, 9, 9, 8)     // Mutable Set, READ and WRITE both

    mySet.remove(54)
    mySet.add(100)

    for (element in mySet) {
        println(element)
    }
}
