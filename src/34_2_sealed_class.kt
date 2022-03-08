
// Limitations of Enum class is overcome by sealed class. 
enum class Color(val colorShade: String) {
    RED("light red"),
    GREEN("light green"),         // These hard-coded values cannot be changed. They are constants. 
    // BLUE(val myBlueColorShade: String)  // variable values are not allowed in enum 
}

sealed class Shape {
    data class Circle(var radius: Float): Shape()   // subclass can be a data class
    class Square(var side: Int): Shape()            // subclass can be a regular class

    object NotAShape : Shape()      // subclass can be an object (singleton)

    // sealed class Line : Shape()     // subclass can be another sealed class
    // sealed interface Draw           // subclass can be an interface
}

// You can define any type of subclass outside the sealed class too
class Rectangle(var length: Int, var breadth: Int): Shape()


fun main() {

    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
    var rectangle = Rectangle(20,10)    // Slightly different than above two 

    val noShape = Shape.NotAShape 

    checkShape(noShape)
}

fun checkShape(shape: Shape) {

    when (shape) {
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Square area is ${shape.side * shape.side}")
        is Rectangle -> println("Rectagle area is ${shape.length * shape.breadth}")
        Shape.NotAShape -> println("No shape found")  // 'is' is not required for object (singleton)
        //  else -> "else case is not required as all case is covered above"
    }
}
