/**
Q11: Write a program that takes a list of strings and returns a list of lengths of each string using map.
*/
class q_11 {
    init {
        println("q_11 called.\nPrint a list of Strings (use ',' between):")
        val listOfStrings = readInput().split(",")
        println(listOfStrings)
        println(listOfLenghts(listOfStrings))
    }
    
    fun listOfLenghts(list: List<String>):List<Int> {
        return list.map{it.length}
    }
}