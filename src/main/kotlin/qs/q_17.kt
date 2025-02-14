/**
Q17: Define an interface Drawable with a draw method, and create two classes, Circle and Square, that implement Drawable. Implement draw differently in each class.
*/
class q_17 {
    init {
        val screen = Screen()
        while (true) {
            println("q_17 called.\nWhat shape do you want to draw?:\n1 - Circle\n2 - Square\n3 - Clear Screen")
            val input = readInput().toIntOrNull()?:0
            when {
                input == 0 -> break
                input == 1 -> {
                    println("Print circle`s side (% of height on 120x30chars screen):")
                    val inputRadius: Float = readInput().toFloatOrNull() ?: 0.0f
                    val circle = Circle(inputRadius)
                    screen.makeFrame(circle)
                    screen.printScreen()
                }
                input == 2 -> {
                    println("Print Square`s side(% of height on 120x30chars screen):")
                    val inputSide = readInput().toFloatOrNull() ?: 0.0f
                    val square = Square(inputSide)
                    screen.makeFrame(square)
                    screen.printScreen()
                }
                input == 3 -> {
                    screen.clearScreen()
                    screen.printScreen()
                }
            }
        }
    }
}

interface Drawable{
    val symbol: Char
    fun draw(x: Float, y: Float): Boolean
}
class Circle(var radius:Float, override val symbol:Char = '+'): Drawable{
    
    override fun draw(x:Float,y:Float):Boolean {
        return (x*x + y*y < this.radius/100)
    }
}
class Square(var side:Float, override val symbol:Char = '@'): Drawable{
    
    override fun draw(x: Float, y: Float):Boolean {
        return (x<this.side/100 && y<this.side/100 && 
                -x<this.side/100 && -y<this.side/100)
    }
}

/**Some stuff to draw in console*/
class Screen(val wight: Int = 120,
             val height: Int = 30,
             val aspectPixel: Float = 11.0f / 33.0f,
             val aspectX: Int = wight / height,
             var frame: CharArray = CharArray(wight * height + 1) { ' ' }
) {
    fun makeFrame(drawable: Drawable) {
        for (i in 0 until wight) {
            for (j in 0 until height) {
                val x: Float = (i.toFloat() / wight * 2.0f - 1.0f) * aspectX * aspectPixel
                val y: Float = (j.toFloat() / height * 2.0f - 1.0f)
                
                if (drawable.draw(x, y)) {
                    frame[i + j * wight] = drawable.symbol
                }
            }
        }
    }
    fun printScreen() {
        for (j in 0 until height) {
            for (i in 0 until wight) {
                print(frame[i + j * wight])
            }
            println()
        }
    }
    fun clearScreen() {
        frame = CharArray(wight * height + 1) { ' ' }
    }
}
