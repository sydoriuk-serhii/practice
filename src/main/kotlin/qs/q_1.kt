/**
Q1: Write a Kotlin function to check if a given integer is a prime number. Use a when expression for decision-making.
*/
class q_1 {
    init {
        println("q_1 called\nPrint any Integer to check is it prime.")
        val num = readInput().toIntOrMessage()
        when
        {
            isPrime(num) -> println("Integer ($num) is a prime!")
            !isPrime(num) -> println("Integer ($num) is not a prime!")
        }
    }
}
fun isPrime(num: Int): Boolean {
    if (!isNatural(num)) return false
    for (i in 2..<num) {
        if (num % i == 0) return false
    }
    return true
}

fun isNatural(num: Int): Boolean {
    return if(num>0) true else false
}
