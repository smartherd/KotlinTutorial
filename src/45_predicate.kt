
/**
 *  PREDICATES
 * */
fun main(args: Array<String>) {

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = { num: Int -> num > 10 }

    val check1 = myNumbers.all( myPredicate )       // Are all elements greater than 10?
    println(check1)

    val check2 = myNumbers.any(myPredicate)         // Does any of these elements satisfy the predicate?
    println(check2)

    val totalCount: Int = myNumbers.count(myPredicate) // Number of elements that satify the predicate.
    println(totalCount)

    val num = myNumbers.find(myPredicate)           // Returns the first number that matches the predicate
    println(num)
}
