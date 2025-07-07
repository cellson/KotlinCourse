class UserSet(val name: String)

data class DataUserSet(val name: String)

fun main() {
    val set = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
    val ints: Set<Long> = setOf(1L, 2L, 3L)
    println(ints) // [1, 2, 3]
    println( set + setOf('D', 'E')) // [A, B, C, D, E]
    println(set.size) // 3
    println(set.isEmpty()) // false
    // Elements that are already in a set are not added; their addition is just ignored.
    println(set + setOf('A', 'B', 'D', 'E')) // [A, B, C, D, E]
    // Also, if you duplicate arguments in the setOf function, the second argument will be ignored.
    val repSet = setOf<Char>('A', 'B', 'A')
    println(repSet) // [A, B]
    // Two elements are duplicated if they are equal, so if == between them returns true. Since regular
    // classes are considered unique, they are never considered to be duplicates.
    val userSet = setOf(UserSet("A"), UserSet("A"))
    println(userSet + UserSet("A")) // [User@XXX, User@YYY, User@ZZZ]
    // However, data classes are equal when their all-constructor properties have the same values.
    val dataUserSet = setOf(DataUserSet("A"), DataUserSet("A"))
    println(dataUserSet + DataUserSet("A"))

    // Sets use the same commands as lists for iterating and checking if an element is present
}