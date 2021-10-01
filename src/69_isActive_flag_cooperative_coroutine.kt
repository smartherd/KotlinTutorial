import kotlinx.coroutines.*

fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch(Dispatchers.Default) {     // Thread T1: Creates a non-blocking coroutine
        for (i in 0..500) {
            if (!isActive) {
                return@launch // break
            }
            print("$i.")
            Thread.sleep(1)
        }
    }

    delay(10)  // Let's print a few values before we cancel
    job.cancelAndJoin()

    println("\nMain program ends: ${Thread.currentThread().name}")    // main thread
}