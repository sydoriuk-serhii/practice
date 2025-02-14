/**
Q23: Create a class Car that delegates its drive method to another Driver class using Kotlin’s delegation pattern.
*/
class q_23 {
    init {
        println("q_23 called")
        val myCar = Car(Driver())
        myCar.drive()  
    }
}

interface Drivable {
    fun drive()
}

class Driver : Drivable {
    override fun drive() {
        println("The driver is driving the car")
    }
}

class Car(private val driver: Drivable) : Drivable by driver