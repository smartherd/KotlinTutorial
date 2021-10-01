import kotlinx.coroutines.*

fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch(Dispatchers.Default) {     // Thread T1: Creates a non-blocking coroutine
        try {
            for (i in 0..500) {
                print("$i.")
                delay(5)    // or use yield() or any other suspending function as per your need.
            }
        } catch (ex: CancellationException) {
            print("\nException caught safely: ${ex.message}")
        } finally {
            print("\nClose resources in finally")
        }
    }

    delay(10)  // Let's print a few values before we cancel
    job.cancel(CancellationException("My own crash message"))
    job.join()

    println("\nMain program ends: ${Thread.currentThread().name}")    // main thread
}