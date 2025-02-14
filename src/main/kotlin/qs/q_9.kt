/**
Q9: Define an infix function plus that adds two Int values together.
*/
class q_9 {
    init {
        println("q_9 called\nPrint two Integers to add its together")
        val x = readInput().toIntOrMessage()
        val y = readInput().toIntOrMessage()
        println("sum = ${x plus y}")
    }
}

infix fun Int.plus (integer: Int):Int {
    return this + integer
}
