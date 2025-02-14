import kotlin.system.exitProcess

fun main() {
    while (true) {
        println("\n\nWelcome to Serhii_Sydoriuk`s practice for Onix_Systems")
        println("Chose 1..35")
        val qNum = readInput().toIntOrMessage()
        when {
            qNum == 0 -> exitProcess(0)
            qNum == 1 -> q_1()
            qNum == 2 -> q_2()
            qNum == 3 -> q_3()
            qNum == 4 -> q_4()
            qNum == 5 -> q_5()
            qNum == 6 -> q_6()
            qNum == 7 -> q_7()
            qNum == 8 -> q_8()
            qNum == 9 -> q_9()
            qNum == 10 -> q_10()
            qNum == 11 -> q_11()
            qNum == 12 -> q_12()
            qNum == 13 -> q_13()
            qNum == 14 -> q_14()
            qNum == 15 -> q_15()
            qNum == 16 -> q_16()
            qNum == 17 -> q_17()
            qNum == 18 -> q_18()
            qNum == 19 -> q_19()
            qNum == 20 -> q_20()
            qNum == 21 -> q_21()
            qNum == 22 -> q_22()
            qNum == 23 -> q_23()
            qNum == 24 -> q_24()
            qNum == 25 -> q_25()
            qNum == 26 -> q_26()
            qNum == 27 -> q_27()
            qNum == 28 -> q_28()
            qNum == 29 -> q_29()
            qNum == 30 -> q_30()
            qNum == 31 -> q_31()
            qNum == 32 -> q_32()
            qNum == 33 -> q_33()
            qNum == 34 -> q_34()
            qNum == 35 -> q_35()
        }
    }
}
fun readInput():String{
    val input = readLine().orEmpty()
    if(input.isEmpty()) {
        return readInput()
    }
    return input
}
fun String.toIntOrMessage():Int {
    if (this.toIntOrNull() == null) {
        println("Invalid input Int")
        return readInput().toIntOrMessage()
    } else return this.toInt()
}
fun String.toDoubleOrMessage():Double{
    if (this.toDoubleOrNull() == null) {
        println("Invalid input Double")
        return readInput().toDoubleOrMessage()
    } else return this.toDouble()
}
