

/*
* DO WHILE Loop
* */
fun main(args: Array<String>) {

    var i = 0

    do {
        if (i % 2 == 0) {
            println(i)
        }
        i++
    } while (i <= 10)

    println()

    var j = 10

    do {
        if (j % 2 == 0) {
            println(j)
        }
        j--
    } while (j >= 0)
}
