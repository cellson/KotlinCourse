fun main() {

    // Logical Operations

    // The 'and' operator (&&)
    val finishedHomework = false // or true
    var cleanedRoom = true // or false
    var canPlayGames = finishedHomework && cleanedRoom
    println(canPlayGames)

    print(true && true)  // true
    print(true && false)  // false
    print(false && true)  // false
    println(false && false)  // false

    val haveTime = true
    val isResponsible = false
    val canHavePuppy = isResponsible && haveTime
    println(canHavePuppy) // false

    val percent = 47
    val correct = percent >= 0 && percent <= 100
    println(correct) // true

    // The 'or' operator (||)
    val carCleaned = false // or true
    val grassCut = true // or false
    val canGoToCinema = carCleaned || grassCut
    println(canGoToCinema)

    print(true || true)  // true
    print(true || false)  // true
    print(false || true)  // true
    println(false || false)  // false

    val behavedWell = false // or true
    cleanedRoom = false // or true
    val canEatChocolate = behavedWell || cleanedRoom
    println(canEatChocolate)


    val incorrect = percent < 0 || percent > 100
    println(incorrect) // true

    // The 'not' operator (!)
    print(!true) // false
    println(!false) // true

    val isAmazing = true
    print(!isAmazing) // false

    val isBoring = false
    println(!isBoring) // true

    val positive = 1
    println(-positive) // -1

    val negative = -1
    println(-negative) // 1

    print(!true) // false
    print(!!true) // true
    print(!!!true) // false
    print(!!!!true) // true
    println(!!!!!true) // false

    val failedMathExam = true
    val roomCleaned = true
    canPlayGames = !failedMathExam && roomCleaned
    println(canPlayGames) // false

    print(!true && false) // false
    println(!(true && false)) // true
    println(-10 + 20) // 10
    println(-(10 + 20)) // -30
}