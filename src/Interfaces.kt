interface Animal

class Dog(val name: String) : Animal {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

class Cat(val name: String) : Animal {
    fun pet() {
        println("Mrr")
    }
}

fun play(animal: Animal) {
    when (animal) {
        is Dog -> animal.retrieve("stick")
        is Cat -> animal.pet()
    }
}

fun consumeAny(any: Any) {}

fun consumeNumber(number: Number) {}

fun main() {
    play(Dog("Rex")) // Retrieving stick
    play(Cat("Garfield")) // Mrr

    val i: Int = 120
    val l: Long = 1234567890L
    val d: Double = 10.0
    consumeAny(i) // upcasting Int to Any
    consumeAny(l) // upcasting Long to Any
    consumeAny(d) // upcasting Double to Any
    consumeNumber(i) // upcasting Int to Number
    consumeNumber(l) // upcasting Long to Number
    consumeNumber(d) // upcasting Double to Number
}