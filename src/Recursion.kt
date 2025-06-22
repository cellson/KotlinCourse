//fun factorial(number: Int): Int {
//
//    var accumulator = 1
//
//     for (i in 1..number) {
//
//         accumulator = accumulator * i
//     }
//
//    return accumulator
//}

/*
The following function is an example of recursion
 */

fun factorial(number: Int): Int {
    if (number <= 1) return 1
    return factorial(number - 1) * number
}

/*
Explanation:

Let's say that you call factorial(3). The steps for this call are broken down as follows:

Step 1: Run the factorial function with 3 as the number. Since 3 is larger than 1, you pass
the condition and reach factorial(2) * 3.

So, you need to calculate the value of factorial(2).

Step 2: Run the factorial function with 2 as the number. Since 2 is larger than 1, you pass
the condition and reach factorial(1) * 2.

So, you need to calculate factorial(1).

Step 3: Run the factorial function with 1 as the number. Since 1 is not larger than 1, it
returns 1.

So factorial(1) * 2 becomes 1 * 2 which becomes 2.

As the resulting factorial(2) * 3 becomes 2 * 3, that becomes 6.

So that is the result of factorial(3).
 */

fun main() {

    println(factorial(1)) // 1
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720
}