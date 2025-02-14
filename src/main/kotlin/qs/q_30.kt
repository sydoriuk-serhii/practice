/**
Q30: Implement a custom function similar to filter that takes a predicate and returns a new list containing only elements that match the predicate.
*/
class q_30 {
    init {
        println("q_30 called.\nPrint a list of Integers to get list of only even numbers (use ',' between):")
        val listOfNums = readInput().split(",").map { it.toIntOrMessage() }

        val evenNumbers = listOfNums.customFilter { it % 2 == 0 }

        println("Even nums: $evenNumbers")
    }
}

fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}