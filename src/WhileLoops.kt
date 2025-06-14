fun main() {

    var toBePrinted = true
    while (toBePrinted) {
        println("Will be printed once")
        toBePrinted = false
    }


    // Here is a code that calls its body for numbers form 0 to 2
    var printedTimes = 0
    while (printedTimes <= 2) {
        println("Line $printedTimes");
        printedTimes += 1 // or printedTimes = printedTimes + 1
    }

    /*
    Mathematical Sequences
     */

    var num = 1
    while (num <100) {
        println(num)
        num *= 2 }

    // Note that a while loop may be written on one line, with the addition of
    // a semicolon before the iterator operation.

    var i = 1
    while (i * i <= 100) { println(i * i); i++}
}