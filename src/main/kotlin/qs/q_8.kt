/**
Q8: Create an extension function isPalindrome for the String class that returns true if the string is a palindrome, ignoring case.
*/
class q_8 {
    init {
        println("q_8 called\nCheck if a string is a palindrome.")        
        val input = readInput()
        println(input.isPalindrome())
    }
}

fun String.isPalindrome(): Boolean {
    return this.lowercase() == this.lowercase().reversed()
}
