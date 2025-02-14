/**
Q27: Write a function that takes a vararg of integers and returns their sum.
*/
class q_27 {
    init {
        println("q_27 called.\nPrint a list of Integers to get its` sum (use ',' between):")
        val listOfNums = readInput().split(",").map{it.toIntOrMessage()}
        println("Sum: ${sumNumbers(*listOfNums.toIntArray())}")
    }
}

fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}
