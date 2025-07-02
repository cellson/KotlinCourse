fun main() {

    // Pair Class

    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
        // the type of number is Double
        // the type of letter is Char
    println(number) // 1.0
    println(letter) // A

    val pair2 = 2.0 to 'B'
    println(pair2.first) // 2.0
    println(pair2.second) // B
    val (number2, letter2) = pair2
    // the type of number is Double
    // the type of letter is Char
    println(number2) // 2.0
    println(letter2) // B

    // Triple Class

    val triple = Triple(1F, "ABC", true)
    println(triple.first) // 1.0
    println(triple.second) // ABC
    println(triple.third) // true
    val (number3, letters, boolean) = triple
    // these two lines were me figuring out how to show the data type
//    println(number3.javaClass.name)
//    println(number3.javaClass.kotlin)
        // the type of number3 is Float
        // the type of letters is Char
        // the type of boolean is Boolean
    println(number3) // 1.0
    println(letters) // ABC
    println(boolean) // true
}