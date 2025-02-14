/**
Q6: Write a when expression that takes an integer and prints “Even” if it’s even and “Odd” if it’s odd.
*/
class q_6 {
    init {
        println("q_6 called\nPrint an integer to see is it even or odd.")
        val num:Int = readInput().toIntOrMessage()
        when (num % 2 == 0) {
            true -> println("$num is even")
            false -> println("$num is odd")
        }
    }
}