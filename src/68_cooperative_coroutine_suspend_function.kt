import kotlinx.coroutines.*

fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch {     // Thread main: Creates a non-blocking coroutine
        for (i in 0..500) {
            print("$i.")
            yield()     // or use delay() or any other suspending function as per your need.
        }
    }

    delay(10)  // Let's print a few values before we cancel
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")    // main thread
}
