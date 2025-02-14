/**
Q10: Given a list of integers, write a function to find the maximum and minimum values using Kotlin’s standard library functions.
*/
class q_10 {
    init {
        println("q_10 called.\nPrint a list of Integers (use ',' between):")
        val integerList: List<Int> = readInput().split(",").map{it.toIntOrMessage()}
        val (minNum, maxNum) = findMaxAndMin(integerList)
        println("Min value = $minNum, Max value = $maxNum")
    }
    
    fun findMaxAndMin(list: List<Int>): Pair<Int, Int> {
        return Pair(list.min(), list.max())
    }
}