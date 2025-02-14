import kotlinx.coroutines.*
/**
Q22: Write a coroutine that simulates a long-running task but allows the user to cancel it by using a Job.
*/
class q_22 {
    init {
        runBlocking {
            print("q_22 called. Press 0 to cancel a task\n")
            val scope = CoroutineScope(Dispatchers.Default)
            val inputJob = scope.launch {
                while (isActive) {
                    withTimeoutOrNull(500L) { 
                        val input = readLine()
                        if (input == "0") {
                            println("User canceled the task.")
                            scope.cancel()
                        }
                    }
                    delay(500L) 
                }
            }

            val longRunningJob = scope.launch {
                repeat(20) { i -> 
                    if (!isActive) return@launch
                    delay(500L)
                    println("long-running job... step ${i + 1}")
                }
                println("Task completed!")
                scope.cancel()
            }

            longRunningJob.join()
        }
    }
}
