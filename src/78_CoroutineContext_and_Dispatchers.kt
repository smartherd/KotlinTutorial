import kotlinx.coroutines.*

fun main() = runBlocking {

    // this: CoroutineScope instance
    // coroutineContext: CoroutineContext instance

    /* Without Parameter: CONFINED      [CONFINED DISPATCHER]
        - Inherits CoroutineContext from immediate parent coroutine.
        - Even after delay() or suspending function, it continues to run in the same thread.  */
    launch {
        println("C1: ${Thread.currentThread().name}")       // Thread: main
        delay(1000)
        println("C1 after delay: ${Thread.currentThread().name}")   // Thread: main
    }

    /* With parameter: Dispatchers.Default [similar to GlobalScope.launch { } ]
        - Gets its own context at Global level. Executes in a separate background thread.
        - After delay() or suspending function execution,
            it continues to run either in the same thread or some other thread.  */
    launch(Dispatchers.Default) {
        println("C2: ${Thread.currentThread().name}")   // Thread: T1
        delay(1000)
        println("C2 after delay: ${Thread.currentThread().name}")   // Thread: Either T1 or some other thread
    }

    /*  With parameter: Dispatchers.Unconfined      [UNCONFINED DISPATCHER]
        - Inherits CoroutineContext from the immediate parent coroutine.
        - After delay() or suspending function execution, it continues to run in some other thread.  */
    launch(Dispatchers.Unconfined) {
        println("C3: ${Thread.currentThread().name}")   // Thread: main
        delay(1000)
        println("C3 after delay: ${Thread.currentThread().name}")   // Thread: some other thread T1
    }

    launch(coroutineContext) {
        println("C4: ${Thread.currentThread().name}")       // Thread: main
        delay(1000)
        println("C4 after delay: ${Thread.currentThread().name}")   // Thread: main 
    }

    println("...Main Program...")
}
