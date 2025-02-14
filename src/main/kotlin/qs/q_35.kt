import kotlin.reflect.full.memberProperties
/**
Q35: Write a simple function that takes an object and prints all of its property names and values using reflection.
*/
class q_35 {
    init {
        println("q_35 called")
        val person = Person("Serhii Sydoriuk", 19, "liserhiisydoriuk@gamil.com")
        printProperties(person)
    }
}
fun printProperties(obj: Any) {
    val objClass = obj::class
    println("сlass = ${objClass.simpleName}")
    
    for (property in objClass.memberProperties) {
        val value = property.getter.call(obj)
        println("${property.name} = $value")
    }
}
/*
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Serializable


class Person(@Serializable val name: String, val age: Int, @Serializable val email: String)
*/
