fun main() {

    // Creating a triangle using a nested for-loop
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    /*
    Output:
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
     */

    // Creating an upside down triangle with downTo
    for (i in 1..5) {
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    /*
    Output:
    *****
    ****
    ***
    **
    *
     */

    // Parametrized upside down triangle
    for (numberOfStars in height downTo 1) {
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    /*
    Output:
    **********
    *********
    ********
    *******
    ******
    *****
    ****
    ***
    **
    *
     */

    // Creating sideways triangle
    val width = 5
    for (i in 1 until width step 2) { //prints 1 and 3 stars
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2) { //prints 5, 3, 1 stars
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    /*
    Output:
    *
    ***
    *****
    ***
    *
     */

    // Creating backward triangle
    for (i in 1..5) {
        val numberOfSpaces = 5 - i //starts at 4 and goes down to 0
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) { //prints stars from 1 to 5
            print("*")
        }
        println()
    }
    /*
    Output:
        *
       **
      ***
     ****
    *****
     */

    // Creating isosceles triangle
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1 //starts at 1 star and adds 2 each step
        for (j in 1..numberOfStars) {
            print("*")
        }
    }
    /*
    Output:
        *
       ***
      *****
     *******
    *********
     */
}