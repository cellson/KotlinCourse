/*
Use enum classes whenever you need to define a specific set of values.

Let's say that you need to express a day of the week. A good choice is to define an
enum class with the seven possible options:
 */
enum class WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
/*
In a game, you could specify a difficulty level using an enum:
 */
enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}
/*
Defining values in enum classes
Enum class can also have a constructor. It looks just like a constructor in regular classes, but
when it is defined, each value needs to call it. This mechanism is used to assign values to each
enum value. For instance, in the pizza sizes example, it could be a size in centimeters.
 */
enum class PizzaSize (
    val sizeInCm: Int
) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}

fun main() {
    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm
}