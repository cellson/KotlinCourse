fun main() {

    /*
    When Statement
     */
    println("Is it going to rain?")
    var probability = 70
    when {
        probability < 40 -> {
            println("Unlikely")
        }
        probability <= 80 -> {
            println("Likely")
        }
        probability <= 100 -> {
            println("Yes")
        }
        else -> {
            println("What?")
        }
    }

    /*
    Just like in an if statement, braces are needed only for bodies with more
    than one statement. If there is only one statement in a body, you can leave
    out the braces.
     */
    probability = 35
    when {
        probability < 40 -> println("Unlikely")
        probability <= 80 -> println("Likely")
        probability <= 100 -> println("Yes")
        else -> println("What?")
    }

    /*
    Using when as an expression

    The when statement can also be used as an expression in order to produce a
    value. The only rule is that a when statement must have an else block so that
    it has a value to return in case no other block is chosen.
     */
    probability = 95
    var text = when {
        probability < 40 -> "Unlikely"
        probability <= 80 -> "Likely"
        probability <= 100 -> "Yes"
        else -> "What?"
    }
    println(text)


    /*
    When with a value

    There is also another form of the when statement. If you add a value in
    brackets after the when keyword, then in each branch, Kotlin compares this
    value to other values. In the following example, when number is 1, the when
    statement chooses the branch with a value of 1 and prints, Missed hit. When
    number is 2, 3, 4 or 5, the second branch is chosen, and Hit with value
    {number value} is printed. When the value is 6, the last branch is chosen,
    and Critical hit is printed.
     */

    val number = 1 // or 2, 3, 4, 5, 6
         when (number) {
             1 -> {
        println("Missed hit")
             }
             2, 3, 4, 5 -> {
        println("Hit with value $number")
             }
             6 -> {
        println("Critical hit")
            }
         }


    // Such a when statement can be used as an expression as well. In this
    // example, it is used to produce a text value. Notice that you needed to add
    // an else block for the case when the value of the number variable is not
    // one of the values handled in the other when branches. So if the number is
    // 10, then Unsupported value will be printed.

    text = when (number) {
        1 -> "Missed Hit"
        2,3,4,5 -> "Hit with value $number"
        6 -> "Critical hit"
        else -> "Unsupported value"
    }
    println(text)

    /*
    Using ranges in when statements

    The when expression can be simplified, thanks to the feature known as a range
    check. In some branches, the condition might be checking if a value is
    inside a collection or a range. In the following example, instead of 2, 3,
    4, , 2..5 was used, so instead of providing values to compare to, it checks
    if the value is in a range of values from 2 to 5. The syntax is as follows:
    start with the in keyword, and then specify either a collection or a range
    that might contain the value or not. Both collections and ranges will be
    covered later in this course.
     */

    text = when (number) {
            1 -> "Missed hit"
            in 2..5 -> "Hit with value $number"
            6 -> "Critical hit"
            else -> "Unsupported value"
            }
    println(text)


    /*
    Type check

    As was explained earlier in the course, every value has a certain type. For
    instance, 123 is of type Int, and "ABC" is of type string. When you have a
    value, you can check if it is of a certain type using the is keyword. Here
    are a few examples:
     */

    var value: Any = "ABC"

    println(value is String) // true
    println(value is Int) // false
    println(value is Boolean) // false
    println(value is Any) // true

    value = 123

    println(value is String) // false
    println(value is Int) // true
    println(value is Boolean) // false
    println(value is Any) // true

    // Type-check can also be used as a branch in a when statement with a
    // value. This is a popular pattern in Kotlin to decide what action should be
    // performed based on a variable type.

    val something: Any = 0.0123456789f // or 123, 0.1, true
        when (something) {
            is String -> println("This is String")
            is Int -> println("This is Int")
            is Double -> println("This is Double")
            is Boolean -> println("This is Boolean")
            is Float -> println("This is Float")
        }
    println(something)

}