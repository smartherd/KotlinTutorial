
/*
* Explore String Interpolation in Kotlin
* */
fun main(args: Array<String>) {

    var rect = Rectangle()
    rect.length = 5
    rect.breadth = 3

    print("The length of the rectangle is ${rect.length} and breadth is ${rect.breadth}. The area is ${rect.length * rect.breadth}")

}

class Rectangle {

    var length: Int = 0
    var breadth: Int = 0
}
