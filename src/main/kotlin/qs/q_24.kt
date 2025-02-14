/**
Q24: Use the by lazy delegate to initialize a property only when it’s accessed for the first time.
*/
class q_24 {
    init {
        println("q_24 called")
        val loader = Loader()
        println("\nFirst request fot data:")
        println(loader.someData) 
        println("\nSecond request fot data:")
        println(loader.someData)
    }
}

class Loader {
    val someData: String by lazy {
        println("initialization data") //initialization -> caching
        "value data"
    }
}