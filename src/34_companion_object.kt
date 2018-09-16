
/*
*   1. Companion Object
* */
fun main(args: Array<String>) {

    MyClass.count           // You can print it and check result

    MyClass.typeOfCustomers()
}

class MyClass {

    companion object {

        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Indian"
        }
    }
}
