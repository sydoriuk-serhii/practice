/**
Q14: Implement a function that takes a nullable String? and prints “Empty” if it’s null or blank, or prints the string itself otherwise.
*/
class q_14 {
    init {
        println("q_14 called.\nPrint a String, empty String or print /null to make String = null:")
        var input:String? = readLine()
        if (input == "/null") input = null
        println(printNullableString(input))
    }
    
    fun printNullableString(string: String?):String?{
        return if(string.isNullOrBlank()) "Empty" else string
    }
}