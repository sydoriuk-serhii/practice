import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties // 1.8.0
/**
Q34: Create a custom annotation @Serializable and use reflection to list all properties of a class that have this annotation.
*/
class q_34 {
    init {
        println("q_34 called")
        val person = Person("Serhii Sydoriuk", 19, "liserhiisydoriuk@gamil.com")
        listSerializableProperties(person)
    }
}

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Serializable


class Person(@Serializable val name: String, val age: Int, @Serializable val email: String)


fun listSerializableProperties(instance: Any) {
    val kClass = instance::class
    println("Properties annotated with @Serializable:")

    for (property in kClass.memberProperties) {
        if (property.findAnnotation<Serializable>() != null) {
            println(property.name)
        }
    }
}