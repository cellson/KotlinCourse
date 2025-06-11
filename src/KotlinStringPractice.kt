

fun main() {
    var s1 = "Hello"
    val s2 = s1 // s1 and s2 now point at the same string - "Hello"
    println(s1) // prints "Hello"
    println(s2) // prints "Hello"
    s1 += " world" // append "world" to s1
    println(s1) // prints "Hello world"
    println(s2) // still prints "Hello" because s2 still points to the String
                // "Hello" while s1 is a new String object

    // Char
    val myChar = 'a'

    // String
    val myString = "Hello"

    //multi-line
    val myMultiLineString = """Hello
        |This is a String.
        |It is on multiple lines.
    """.trimMargin()
    println(myMultiLineString)

    //string template
    val age = 70
    val myStringTemplate = "My age is $age"
    println(myStringTemplate)

    // Converting Char to a String
    val myCharToString = myChar.toString()
    println(myCharToString)

    // Appending to a String
    //myString is still Hello after this operation.
    val myLongString = myString + " World"
    println(myLongString)

    // Checking the length of a String
    val myStringLength = myString.length
    println(myStringLength)

    // Searching Strings
        // True if the String starts with Hel, otherwise false
    val startsWithHel = myString.startsWith("Hel")
    println(startsWithHel)
        // True if the String ends with lo, otherwise false
    val endsWithLo = myString.endsWith("lo")
    println(endsWithLo)
        // Get the first character
    val firstChar = myString.first()
    println(firstChar)
        // Get the last character
    val lastChar = myString.last()
    println(lastChar)
        // True if the String is equal to Hello, otherwise false
    val equalsHello = myString.equals("Hello")
    println(equalsHello)

    // Manipulating Strings
        // Convert the String to uppercase
    val myUpperString = myString.uppercase()
    println(myUpperString)
        // Convert the String to lowercase
    val myLowerString = myString.lowercase()
    println(myLowerString)
        // Get all the characters from the second character onwards
    val myString2 = myString.substring(1)
    println(myString2)

}