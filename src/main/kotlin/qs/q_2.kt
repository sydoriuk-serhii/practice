/**
Q2: Implement a function that takes a nullable string, returns its length if it’s not null, and returns -1 if it is null. Use Kotlin’s safe call operator.
*/
class q_2 {
    init {
        println("q_2 called\nString`s lenght. Print any String or print /null to make String = null.")
        var num:String? = readInput()
        if (num == "/null") num = null
        lenghtStr(num)
    }
    
    fun lenghtStr(str: String?) { 
        println(str?.length?:-1)
    }
}