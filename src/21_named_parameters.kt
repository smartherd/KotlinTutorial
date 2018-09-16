

/*
*   Named Parameters
* */
fun main(args: Array<String>) {

    var result = findTheVolume(breadth = 2, length = 3)
    print(result)
}

fun findTheVolume(length: Int, breadth: Int, height: Int = 10): Int {

    return length * breadth * height
}
