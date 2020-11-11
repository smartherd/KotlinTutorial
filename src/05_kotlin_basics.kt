

/*
* This is main function. Entry point of the application.
* */
fun main(args: Array<String>) {

    var personObj = Person()
    personObj.name = "Steve"

    print("The name of the person is ${personObj.name}")
}

class Person {

    var name: String = ""
}
