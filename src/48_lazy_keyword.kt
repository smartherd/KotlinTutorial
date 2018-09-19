

val pi: Float by lazy {
    3.14f
}

fun main(args: Array<String>) {

    println("Some initial code.....")

    // pi is not initialised yet

    val area1 = pi * 4 * 4      // pi gets initialised and assigned the value of 3.14f for the first time

    val area2 = pi * 9 * 9      // The value pi is loaded from cache memory

    println("Some more code....")
}


// ‘lazy initialization’ was designed to prevent unnecessary initialization of objects.
// You variables will not be initialised unless you use it in your code
// It is initialized only once. Next time when you use it, you get the value from cache memory.

// It is thread safe
// It is initialized in the thread where it is used for the first time.
// Other threads use the same value stored in the cache

// The variable can be var or val.
// The variable can be nullable or non-nullable
