/**
Q4: Write a program that calculates the factorial of a given number using recursion.
*/
class q_4 {
    init {
        print("\nq_4 called\nPrint the number to calculate it`s factorial.")
        val num = readInput().toIntOrMessage()
        print(factorialRecursiv(num))
    }
    fun factorialRecursiv(num: Int): Int {
        if (num == 1 || num == 0) {
            return 1
        } 
        if (!isNatural(num)) { 
            println("Not natural number ")
            return num
        }
        return num * factorialRecursiv(num-1)
    }
}