/**
Q29: Use flatMap to create a list of all words from a list of sentences.
*/
class q_29 {
    //.split(".",",","!","?",":",";","-","+","=")
    init {
        println("q_29 called.\nEnter sentences separated by '.':")
        val sentences: List<String> = readInput().split(".").map { it.trim() }
        println(sentences.size)
        val words = sentences.flatMap { sentence ->
            sentence.split(" ",",", ".", "!", "?", ":", ";", "-", "+", "=")
                .map { it.trim() }
                .filter { it.isNotEmpty() }
        }
        println("All words: $words")
    }
    /*
    hello world, my name is. Two  empty?
    */
}