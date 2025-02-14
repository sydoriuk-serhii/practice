/**
Q13: Write a function that accepts a nullable List<Int>? and returns the sum of its elements, handling nulls safely without using !!.
*/
class q_13 {
    init {
        println("q_13 called.\nPrint a list of Doubles to get it`s sum (use ',' between):")
        val listOfInts: List<Double>? = readInput().split(",").map{it.toDoubleOrMessage()}
        val emptyList: List<Double>? = emptyList()
        val nullList: List<Double>? = null
        println("Sum number of Doubles in List: ${sumOfList(listOfInts)}")
        println("Sum number of Doubles in empty List: ${sumOfList(emptyList)}")
        println("Sum number of Doubles in null List: ${sumOfList(nullList)}")
    }
    
    fun sumOfList(list: List<Double>?): Double {
        return (list?.sum()?:0).toDouble()
    }
}