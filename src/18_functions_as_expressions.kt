

/*
*   FUNCTIONS as Expressions
* */
fun main(args: Array<String>) {

    var largeValue = max(4, 6)

    println("The greater number is $largeValue")
}

fun max(a: Int, b: Int): Int
                    = if (a > b) {
                        println("$a is greater")
                        a
                    } else {
                        println("$b is greater")
                        b
                    }
