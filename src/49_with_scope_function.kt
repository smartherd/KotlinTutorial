class Person {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun main() {

    /** Scope Function: 'with'
        Property 1: Refer to context object by using 'this'
        Property 2: The return value is the 'lambda result'  */

    val person = Person()

    val bio: String = with(person) {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way" // will be returned and stored in 'bio' String variable
    }

//    println("Age after five years is $ageAfterFiveYears")
    println(bio)
}