import kotlinx.coroutines.*

fun main() = runBlocking {

    println("runBlocking: $this")

    launch {
        println("launch: $this")

        launch(coroutineContext) {
            println("child launch: $this")
        }
    }

    async {
        println("async: $this")
    }

    println("... some other code...")
}