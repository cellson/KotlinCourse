class Frog(
    val name: String
)

data class Pig(
    val name: String,
    val age: Int
)

fun main() {
    val kermit1 = Frog("Kermit")
    val kermit2 = Frog("Kermit")

    println(kermit1 == kermit2) // false
    println(kermit1 == kermit1) // true
    println(kermit1)
    println("Frog: $kermit1")

    val msPiggy1 = Pig("Miss Piggy", 35)
    val msPiggy2 = Pig("Miss Piggy", 35)
    val babe = Pig("Babe",2)

    println(msPiggy1 == msPiggy2) // true
    println(msPiggy1 == msPiggy1) // true
    println(msPiggy1 == babe) // false
    println(msPiggy1) // Pig(name=Miss Piggy
    println("Pig: $msPiggy1") // Pig: Pig(name=Miss Piggy)

    val (name, age) = msPiggy1
    println(name)
    println(age)

    println(msPiggy1.copy()) // Pig(name=Miss Piggy, age=35)
    println(msPiggy1.copy(age = 25)) // Pig(name=Miss Piggy, age=25)
    println(msPiggy1.copy("Peaches")) // Pig(name=Peaches, age=35
}