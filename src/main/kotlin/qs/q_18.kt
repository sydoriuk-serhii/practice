/**
Q18: Create a generic function printList that takes a list of any type and prints each item. Ensure type safety using generics.
*/
class q_18 {
    init {
        println("q_18 called.")
        val mixedList: List<Any> = listOf(1, "Hello", 3.14)
        printList(mixedList)
    }
}

fun <T> printList(items: List<out T>) {
    for (item in items) {
        println(item)   
    }
}