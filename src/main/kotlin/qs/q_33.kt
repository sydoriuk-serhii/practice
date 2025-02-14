import kotlinx.coroutines.*
import kotlin.random.Random
/**
Q33: Write a function to run multiple coroutines simultaneously using coroutineScope, collecting the results as they finish.
*/
class q_33 {
    init {
        println("q_33 called")
        runBlocking {
            println(
                measureExecutionTime {
                println(runMultipleTasks())
            })
        }
    }
}
suspend fun runMultipleTasks(): List<String> = 
    coroutineScope {
    val tasks = List(5) { subTask ->
        async {
            delay(Random.nextLong(500, 2000))
            "Task ${subTask.inc()} completed"
        }
    }
    tasks.awaitAll() 
}