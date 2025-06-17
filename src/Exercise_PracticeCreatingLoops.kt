fun main() {

    // This first loop is the one I came up with first.
    // It is functionally the same as what the lesson was
    // looking for, but iterated 0..4 instead of 1..5

//    for (i in 0 until 5) {
//        val numSpaces = i
//        for (j in 0 until numSpaces) {
//            print(" ")
//        }
//        val numStars = 5 - i
//        for (j in 0 until numStars) {
//            print("*")
//        }
//        println()
//    }


    // This is what the lesson was expecting.
    // It is a little less convoluted than my loop.

    for (i in 1..5) {
        val numSpaces = i - 1
        for (j in 1..numSpaces) {
            print(" ")
        }
        val numStars = 6 - i
        for (j in 1..numStars) {
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

    for (i in 1..10 step 2) {
        val numSpaces = i / 2
        for (j in 1..numSpaces) {
            print(" ")
        }
        val numStars = 10 - i
        for (j in 1..numStars) {
            print("*")
        }
        println()
    }
    /*
    Output:
    *********
     *******
      *****
       ***
        *
     */


    // I'm not sure if I was allowed to use if-else statements, but this
    // is the solution I came up with. I think it's pretty eloquent.
    for (i in 1..9) {
        if (i <= 5) {
            val numSpaces = 5 - i
            for (j in 1..numSpaces) {
                print(" ")
            }
            val numStars = i
            for (j in 1..numStars) {
                print("*")
            }
        } else {
            val numSpaces = i - 5
            for (j in 1..numSpaces) {
                print(" ")
            }
            val numStars = 10 - i
            for (j in 1..numStars) {
                print("*")
            }
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
     ****
      ***
       **
        *
     */

    // The following is the official solution code for the last problem.
    // I like mine better, although it's not purely for-in loops.
    for (i in 1 until 5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    // The following is the code that ChatGPT suggested as even cleaner.
    for (i in 1..9) {
        val numSpaces = if (i <= 5) 5 - i else i - 5
        val numStars = if (i <= 5) i else 10 - i

        repeat(numSpaces) { print(" ") }
        repeat(numStars) { print("*") }
        println()
    }
}