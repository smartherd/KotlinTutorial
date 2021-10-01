import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class SimpleTest {

    @Test
    fun myFirstTest() = runBlocking {
        myOwnSuspendingFunc()
        Assert.assertEquals(10, 5 + 5)
    }
}