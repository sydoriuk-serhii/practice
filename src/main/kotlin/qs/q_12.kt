/**
Q12: Use filter and sortedByDescending to get a sorted list of only the odd numbers from a list of integers.
*/
class q_12 {
    init {
        println("q_12 called.\nPrint a list of Integers to get list of only odd numbers (use ',' between):")
        val listOfNums = readInput().split(",").map{it.toIntOrMessage()}.filter{it % 2 != 0}.sortedDescending()
        println(listOfNums)
    }
}