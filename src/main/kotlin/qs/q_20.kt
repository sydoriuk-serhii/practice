import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
Q20: Write a coroutine that fetches two mock API responses in parallel and combines the results. Use async and await to achieve this.
*/
class q_20 {
    init {
        println("q_20 called")
        runBlocking<Unit> {
            val time = measureTimeMillis {
                val response1 = async { fakeApiRequest_1() }
                val response2 = async { fakeApiRequest_2() }
                val resultResponse = "${response1.await()} + ${response2.await()}"
                println(resultResponse)
            }
            println("Time taken: $time")
        }
    }
}
suspend fun fakeApiRequest_1():String {
    delay(1000)
    return "Response from Api_1"
}
suspend fun fakeApiRequest_2():String {
    delay(1000)
    return "Response from Api_2"
}