fun main() {
    val list: List<String> = listOf("A", "B", "C")
    println(list) // [A, B, C]
    println(list + "D") // [A, B, C, D]
    println(list + listOf("D", "E")) // [A, B, C, D, E]
    println(listOf("Z") + list) // [Z, A, B, C]
    println(list.size) // 3
    println(list.size == 0) // false
    println(list.isEmpty()) // false
    println(list[0]) // A
    println(list.contains("A")) // true
    println(list.contains("Z")) // false
    println("A" !in list) // false
    println("Z" !in list) // true
    val ints: List<Int> = listOf(1, 2, 3)
    println(ints) // [1, 2, 3]
    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
    for (letter in list) {
        print(letter) // ABC
    }
    println()
    for (number in ints) {
        print(number) // 123
    }
    println()
    val mutList = mutableListOf<String>("A", "B")
    println(mutList) // [A, B]
    mutList.add("C")
    println(mutList) // [A, B, C]
    mutList.remove("B")
    println(mutList) // [A, C]
    mutList[1] = "Z"
    println(mutList) // [A, Z]
}