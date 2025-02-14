/**
Q15: Create an abstract class Shape with an abstract method area and two subclasses Circle and Rectangle that implement area. Test the classes by creating instances.
*/
class q_15 {
    init {
        println("q_15 called.\nPrint Circle radius:")
        val inputRadius :Double = readInput().toDoubleOrMessage()
        val circle = Circle15(inputRadius)
        
        println("Print Rectangle width and height:")
        val inputWidth = readInput().toDoubleOrMessage()
        val inputHeight = readInput().toDoubleOrMessage()
        val rectangle = Rectangle15(inputWidth, inputHeight)

        
        println("Circle area: ${circle.area()}")
        println("Rectangle area: ${rectangle.area()}")
    }
}

abstract class Shape15{
    abstract fun area(): Double
}
class Circle15(var radius: Double): Shape15(){
    override fun area(): Double = Math.PI * radius * radius
}
class Rectangle15(var width:Double, var height:Double): Shape15(){
    override fun area(): Double = width*height
}
