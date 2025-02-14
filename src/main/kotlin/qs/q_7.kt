/**
Q7: Write a higher-order function applyDiscount that takes a price and a discount function.
The discount function should be a lambda that applies a discount percentage to the price.
*/
class q_7 {
    init {
        println("q_7 called\nPrint price and discount in precents as a Double.")
        val price = readInput().toDoubleOrMessage()
        val discount = readInput().toDoubleOrMessage()
        
        val discountFunction: (Double) -> Double = { price: Double -> ((100 - discount)/100)*price }
        
        val pad:Double = applyDiscount(price, discountFunction)
        println("Discounted price: $pad")
    }

    fun applyDiscount(price: Double?, discountFunction: (Double) -> Double): Double {
        return discountFunction(price!!)
    }
}
