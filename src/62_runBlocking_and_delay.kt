import kotlinx.coroutines.*


fun main() = runBlocking {        // Executes in main thread

        println("Main program starts: ${Thread.currentThread().name}")  // main thread

        GlobalScope.launch {    // Thread: T1
            println("Fake work starts: ${Thread.currentThread().name}")     // Thread: T1
            delay(1000)   // Coroutine is suspended but Thread: T1 is free (not blocked)
            println("Fake work finished: ${Thread.currentThread().name}") // Either T1 or some other thread.
        }

        delay(2000)  // main thread: wait for coroutine to finish (practically not a right way to wait)

        println("Main program ends: ${Thread.currentThread().name}")    // main thread
}