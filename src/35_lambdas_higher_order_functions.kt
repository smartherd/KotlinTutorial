
/*
    EXAMPLE ONE

*   1. Lambda Expression
*   2. Higher-Order Function
* */
fun main(args: Array<String>) {

    val program = Program()

    program.addTwoNumbers(2, 7)     // Simple way... for better understanding

    program.addTwoNumbers(2, 7, object : MyInterface {   // Using Interface / OOPs way

        override fun execute(sum: Int) {
            println(sum)    // Body
        }
    })

    val test: String = "Hello"

    val myLambda: (Int) -> Unit = { s: Int -> println(s)}   // Lambda Expression [ Function ]
    program.addTwoNumbers(2, 7, myLambda)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {  // High Level Function with Lambda as Parameter

        val sum = a + b
        action(sum)     // println(sum)
//        println(sum)  // Body
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // Using Interface / Object Oriented Way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {                         // Simple way.. Just for Better Understanding

        val sum =  a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}
