/**
Q3: Create a simple class Person with properties name and age, then create an instance and print its properties using string interpolation.
*/
class q_3 {
    init {
        val person = Person("Serhii", 19)
        println("Hello ${person.name}, ${person.age}")
       
    }
    class Person(val name: String, val age: Int) {}
}
