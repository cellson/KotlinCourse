fun main() {

    val a = 0
    val b = 10
    val c = 3

    // Prints 0 through 10

    for (i in a..b) {
        print("$i ")
    }
    println()

    // Prints 0 through 9, ignoring the value for b

    for (i in a until b) {
        print("$i ")
    }
    println()

    // Prints the value for b descending down to the value for a

    for (i in b downTo a) {
        print("$i ")
    }
    println()

    // Iterates through a value through b value, stepping the value of c,
    // rather than 1.

    for (i in a..b step c) {
        print("$i ")
    }
    println()

    // Iterates b value down to b value, in steps of c value

    for (i in b downTo a step c) {
        print("$i ")
    }
    println()

    // This generates the text for a silly song

    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")

}