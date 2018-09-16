
/*
*   Class, Primary Constructor, Secondary Constructor and Init Block
* */
fun main(args: Array<String>) {

    var student = Student("Steve", 10)

    println(student.id)
}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("Student has got a name as $name and id is $id")
    }

    constructor(n: String, id: Int): this(n) {
        // The body of the secondary constructor is called after init block
        this.id = id
    }
}
