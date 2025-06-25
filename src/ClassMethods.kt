class Dog(val name: String) {

    var hunger = 62

    fun feed() {

        println("Feeding $name")

        hunger = 0
    }
}

/*
When you call a method, the object of their class is passed to their body. It is called a
receiver. It can be accessed using this keyword, also known as receiver reference. So, if you
want to reference an object used to call a method inside this method, use the this keyword.
 */

class User(var name: String) {

    fun changeName(name: String) {

        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}

fun main() {

    val dog = Dog("Rex")

    dog.feed() // Feeding Rex

    val user = User("Alpha") // creates User object with name "Alpha"

    println(user.name)

    user.changeName("Beta") // Changed name from Alpha to Beta

    println(user.name)
}