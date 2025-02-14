/**
Q19: Define a generic class Box that can hold a single item of any type, with functions to add and retrieve the item.
*/
class q_19 {
    init {
        val box = Box<Any>()
        while (true) {
            println("\nq_19 called.\n1 - addIntItem\n2 - addStringItem\n3 - addBoxItem\n\n4 - getItem")
            val input = readInput().toIntOrMessage()

            when (input) {
                1 -> {
                    println("Enter Integer item to add:")
                    val anyItem:Any = readInput().toIntOrMessage()
                    box.add(anyItem)
                }
                2 -> {
                    println("Enter String item to add:")
                    val anyItem:Any = readInput()
                    box.add(anyItem)
                }
                3 -> {
                    println("Enter Box item to add:")
                    val anyItem:Any = Box<Any>()
                    box.add(anyItem)
                }
                4 -> println("Retrieved item: ${box.get()}")
                else -> break
            }
        }
    }
}

class Box<T> (var item: T? = null){

    fun add(item: T) {
        this.item = item
        println("Item added: $item")
    }

    fun get(): T? {
        return if (item != null) {
            item
        } else {
            null
        }
    }
}
