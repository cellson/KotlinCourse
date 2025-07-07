fun main() {
    val capitals: Map<String, String> =
        mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    //  val capitals = mapOf(
    //      Pair("USA", "Washington"),
    //      Pair("Poland", "Warsaw"),
    //      Pair("Ukraine", "Kyiv")
    //  )
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet) // {A=1, B=2, C=3}
    // To find a value by a key, use a box bracket with the key. For instance, to find a value for the
    // key A in the alphabet map, use alphabet['A']. The result is a nullable value type, so Int? in
    // this case.
    //
    // Why nullable? If the key you asked for is not in the map, then null will be returned.
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
    /*
    Adding elements to a map

    Just like a regular list or a regular set, a regular map is read-only, so it does not have methods
    that would allow adding or removing elements. However, you can use plus sign to create a new map
    with new associations. If you add a pair into a map, the result is a map with a new association.
    If you add a new map, the result is a merge of those two maps.
     */
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina")
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex, B=Bob, C=Celina}
    val map3 = mapOf('D' to "Daniel", 'E' to "Ellen")
    val map4 = map2 + map3
    println(map3) // {D=Daniel, E=Ellen}
    println(map4) // {A=Alex, B=Bob, C=Celina, D=Daniel, E=Ellen}
    val testPair = ('F' to "Frank")
    println(testPair)
    val testPair2 = mapOf('F' to "Frank")
    println(testPair2)
    val testPair3 = testPair2 + ('G' to "Georgia")
    println(testPair3)
    // Be aware that duplicate keys are not allowed, so when you add a new association, it removes
    // the old one.
    val testPair4 = testPair3 + ('G' to "Gina")
    println(testPair4)

    //You can also remove certain keys from a map using the minus sign.

    val map5 = mapOf('A' to "Alex", 'B' to "Bob")
    val map6 = map5 - 'B'
    println(map5) // {A=Alex, B=Bob}
    println(map6) // {A=Alex}

//    Checking if a map contains a key
//    You can check if your map contains a key using the in keyword.

    val map7 = mapOf('A' to "Alex", 'B' to "Bob")
    println('A' in map7) // true
    println('Z' in map7) // false

//    Checking map size
//    You can check how many associations you have in a map using the size property.

    val map8 = mapOf('A' to "Alex", 'B' to "Bob")
    println(map8.size) // 2

//    Iterating over maps
//    You can iterate over a map using a for-loop. You iterate over entries that contain key and value
//    properties.

    val map9 = mapOf('A' to "Alex", 'B' to "Bob")
    for (entry in map9) {
        println("${entry.key} is for ${entry.value}")
    }
// A is for Alex
// B is for Bob
    /*
    You can also restructure an entry into two variables. Kotlin supports restructuring in a for-loop.

    For example:
*/
    val map10 = mapOf('A' to "Alex", 'B' to "Bob")
    for ((letter, name) in map10) {
        println("$letter is for $name")
    }
// A is for Alex
// B is for Bob
    /*
    Mutable map
    You can also create a mutable map using mapOf function.

    The result type is MutableMap. You can add new associations to it using the put method or box
    bracket and assignment. You can also remove an association by key using the remove method.
*/
    val map11: MutableMap<Char, String> = mutableMapOf('A' to "Alex", 'B' to "Bob")
    map11.put('C', "Celina")
    map11['D'] = "Daria"
    println(map11) // {A=Alex, B=Bob, D=Daria, C=Celina}
    map11.remove('B')
    println(map11) // {A=Alex, D=Daria, C=Celina}


}