class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'  */

    val person = Person().apply {
        name = "Sriyank Siddhartha"
        age = 26
    }

    with(person) {
        println(name)       // prints   Sriyank Siddhartha
        println(age)        // prints   26 
    }

    // Perform some other operations on 'person' object
    person.also {
        it.name = "Shreks from Smartherd"
        println("New name: ${it.name}")     // prints   New name: Shreks from Smartherd
    }
}