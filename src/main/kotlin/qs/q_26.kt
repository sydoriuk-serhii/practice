import kotlin.system.measureTimeMillis
/**
Q26: Use Kotlin’s inline modifier to define an inline higher-order function that takes a lambda and returns the execution time.
*/
class q_26 {
    init {
        println("q_26 called")
        val numbers = List(500_000) { (0..1_000_000).random() }.toMutableList()
        val executionTime = measureExecutionTime {
            numbers.filter { it % 2 == 0 }
        }
        println("Execution time: $executionTime ms") 
    }
}
inline fun measureExecutionTime(block: () -> Unit): Long {
    return measureTimeMillis {
        block()
    }
}