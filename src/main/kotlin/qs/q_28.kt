/**
Q28: Use fold to compute the product of all elements in a list.
*/
class q_28 {
    init {
        println("q_28 called.\nPrint a list of Integers to get its` product (use ',' between):")
        val listOfNums = readInput().split(",").map{it.toIntOrMessage()}
        println("Product: ${listOfNums.fold(1) { acc, num -> acc * num }}")
    }
}