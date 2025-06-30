// open class inherited by Canine class and Labrador class
open class Mammal {
    fun feedChildren() {}
}
// Open class that is inherited by Labrador class
open class Canine(
    open val name: String,
    val breed: String): Mammal() {
    fun fetchStick() {}
}
// Overrides name property in Canine class
class Labrador(override val name: String) : Canine(name, "Labrador Retriever") {}
// Alternatively, name can be defined without val. The name is passed to the superclass constructor:
// class Labrador(name: String) : Canine(name, "Labrador Retriever") {}
// This behaves practically the same as the previous example.

fun feed(mammal: Mammal) {
    mammal.feedChildren()
}

fun main() {
    val dog = Canine("Charlie","German Shepard")
    val lab = Labrador("Coco")
    println(lab.name)
    println(lab.breed)
    println(dog.name)
    println(dog.breed)
    dog.feedChildren()
    dog.fetchStick()
    feed(dog)
}