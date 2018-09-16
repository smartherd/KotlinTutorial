
/*
* IF as Expression
* */
fun main(args: Array<String>) {

    val a = 2

    val b = 5

    var maxValue: Int = if (a > b) {
                            print("a is greater")
                            a
                        } else {
                            print("b is greater")
                            b
                        }

    println(maxValue)
}
