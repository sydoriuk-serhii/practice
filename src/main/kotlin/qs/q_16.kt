import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.random.Random
/**
Q16: Create a data class Book with properties title, author, and price. Then, create a list of Book objects and filter the list for books with a price less than 20.
*/
class q_16 {
    init {
        println("q_16 called.\nPrint amount of Books")
        val listOfBooks = mutableListOf<Book>()
        val amount = readInput().toIntOrMessage()
        
        for (i in 1..amount) {
            listOfBooks.add(i-1,Book("Book"+i.toString(),"Author"+i.toString(),Random.nextDouble(10.0, 30.0).roundToDecimal(2)))
        }
        println("List of Books:")
        repeat(listOfBooks.size) {index -> println(listOfBooks[index])}
        
        println("\nFiltred List:\n")
        val filtredBooks = listOfBooks.filter{it.price<20.0}.sortedByDescending{it.price}
        repeat(filtredBooks.size) {index -> println(filtredBooks[index])}
    }
}

data class Book(val title: String, val author: String, var price: Double) {}

fun Double.roundToDecimal(decimal: Int): Double {
    return BigDecimal(this).setScale(decimal, RoundingMode.HALF_UP).toDouble()
}