/*
Smart-casting
In this reading, you will learn how to use smart-casting.

You might recall that smart-casting is a Kotlin capability that can change the type of variable for a
scope, but only if Kotlin knows that the variable is of that type in the scope.

For example, if you have a parameter a of type Any, and you add the condition if(a is String), then in
the scope of such check, the variable a changes its type to String, and then you might ask for its length.
*/

//fun consume(a: Any) {
//    if (a is String) {
//        println(a.length) // the type of a is String
//    }
//    if (a is Int) {
//        println(a * 10) // the type of a is Int
//    }
//}
//
//fun main() {
//    consume("ABC")
//    consume(10)
//}
/*
    Smart-casting can also be used to deal with nullability. When you have a nullable type and a check
    that it is not null, Kotlin knows that it is not null when the variable is subsequently used.
*/
//fun consume(a: String?) {
//    if (a != null) {
//        println(a.length) // the type of a is String
//    } else {
//        println("Cannot handle null")
//    }
//}
//
//fun main() {
//    consume("ABC") // 3
/*
Smart-casting is quite powerful and works in a variety of configurations.

 */
fun consume(a: String?) {
    if (a == null || a.length == 0) return // after || a is smart-casted to String
    println(a.length) // the type of a is String
}

fun main() {
    consume("ABC") // 3
    consume(null)
    consume("")
}


/*
However, smart-casting has some limitations. You cannot smart-cast read-write properties. This is due
to safety concerns. Kotlin does not have a guarantee that the value of such a property hasn't been
changed between check and usage by some other part of the program.
 */

//var a: String? = null
//
//fun main() {
//    a = "Sam"
//    if (a != null) {
//        println(a.length)
//    }
//}