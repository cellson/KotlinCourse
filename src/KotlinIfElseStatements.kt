fun main() {

    /*
    If and if-else statements
     */

    var finishedHomework = true
    if (finishedHomework) {
        println("Can go to the cinema")
    }

    if (finishedHomework) {
        println("Can go to the cinema")
    } else {
        println("Cannot go to the cinema")
    }

    val i = 1 // or 5
    if (i < 3) {
        println("Smaller")
    } else {
        println("Bigger")
    }
    // Prints Smaller if i == 1, or Bigger if i == 5


    /*
    Using if-else as expressions

    An if-else statement can be used as an expression. In other words, to return
    a value that can be stored in a variable. The returned value is the value
    returned by the body block that was chosen. In the code below, the predicate
    returns true, so the first body is chosen, so 10.0 is returned.
     */

    val haveSomeExtraMoney = true
    var tip: Double =
        if (haveSomeExtraMoney) {
            10.0
        } else {
            0.0
        }
    println(tip) // 10.0

    //Inside if-else bodies, you can include more than one statement.
    // The value returned by a body is the last expression it has.
    tip =
        if (haveSomeExtraMoney) {
            println("Here you go") // Here you go
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip) // 10.0


    /*
    If-else-if

    By placing one if-else block after another, you form a structure known as
    if-else-if. It is a structure that checks conditions one after another until
    it finds the first one that is fulfilled, and it calls its body. If all the
    conditions return false, the else block is called. This means that in the
    following code, if probability is smaller or equal to 40, then only Unlikely
    will be printed. If probability is over 40 but smaller or equal to 80, then
    only Likely will be printed. If probability is over 80 but smaller or equal
    to 100, then only Yes will be printed. Otherwise, What? will be printed.
     */

    println("Is it going to rain?")
    val probability = 70
    if (probability <= 40) {
        println("Unlikely")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("What?")
    }
}