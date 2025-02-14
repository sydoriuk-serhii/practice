/**
Q5: Use a for loop to create a sequence of the first 10 Fibonacci numbers.
*/
class q_5 {
    init {
        println("q_5 called\nDemonstration of the first N Fibonacci numbers. Print N")
        val amount = readInput().toIntOrMessage()
        var numsList = mutableListOf<Int>()
        
        numsList = fibonacciNums(numsList, amount)
        
        println("First $amount Fibonacci numbers: $numsList")
    }
    
    fun fibonacciNums(fibonaciNumsList: MutableList<Int>, amount:Int): MutableList<Int> {
        repeat(2){fibonaciNumsList.add(1)}
        for (i in 2 until amount) {
            fibonaciNumsList.add(fibonaciNumsList[i - 1] + fibonaciNumsList[i - 2])
        }
        return fibonaciNumsList
    }
}