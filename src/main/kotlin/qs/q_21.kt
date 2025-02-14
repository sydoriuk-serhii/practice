import kotlinx.coroutines.*
/**
Q21: Create a coroutine that launches three separate tasks, each printing a message after a delay. Use launch and delay.
*/
class q_21 {
    init {
        println("q_21 called")
        runBlocking {
            launch { delay(200);println("Messege1 delay 200")}
            launch { delay(100);println("Messege2 delay 100")}
            launch { delay(200);println("Messege3 delay 200")}
        }
    }
}