import kotlinx.coroutines.*


fun main() = runBlocking {    // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch {   // Thread: main
        println("Fake work starts: ${Thread.currentThread().name}")     // Thread: main
        delay(1000)   // Coroutine is suspended but Thread: main is free (not blocked)
        println("Fake work finished: ${Thread.currentThread().name}") // Thread: main
    }

    job.join()      // main thread: wait for coroutine to finish 

    println("Main program ends: ${Thread.currentThread().name}")    // main thread
}