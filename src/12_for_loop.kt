

/*
* FOR Loop
* */
fun main(args: Array<String>) {

    for (i in 1..10) {

        if (i % 2 == 0) {
            println(i)
        }
    }

    println()

    for (i in 10 downTo 0) {

        if (i % 2 == 0) {
            println(i)
        }
    }
}

