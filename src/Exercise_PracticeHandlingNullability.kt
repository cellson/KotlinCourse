data class Students(
    val Id: Int,
    var name: String,
    var grade: Double
)

val students = listOf<Students>(
    Students(223, "John", 140.0),
    Students(548, "Mark", 120.0),
    Students(342, "Natali", 150.0),
    Students(781, "Sara", 130.0)
    )

fun getStudentById(id: Int): Students? {
    return students.find { it.Id == id } !!
}

fun searchInStudents(name: String): Students? {
    return students.find { it.name.lowercase() == name.lowercase() }
}

fun main() {

    var id = 0
    var name = ""
    println("Please, Enter the student's ID")
    try {
        id = readln().toInt()
    } catch (t: Throwable) {
        println("ID must be a number")
    }

    println(getStudentById(id))

    println("Please, Enter the student's name")
    try {
        name = readln()
    } catch (t: Throwable) {
    }
    println(searchInStudents(name)?: "The student is not found")
}