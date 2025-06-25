class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
)

class Student(
    val id: Int,
    val name: String,
    val surname: String
)

fun main() {

    val remigiuszFrost = Teacher(
        "Remigiusz",
        "Frost",
        "23.07.1987",
        "ACTIVE")

    val biology1 = Subject(
        name = "Biology 1",
        teacher = remigiuszFrost,
        isObligatory = true
    )

    val chrisEllson = Student(
        // Can't have an Int with leading zeros
        id = 1,
        name = "Chris",
        surname = "Ellson"
    )

    println(biology1.isObligatory) // true
    println(biology1.teacher.birthday) // 23.07.1987
    println(biology1.teacher.status) // ACTIVE
    println("${chrisEllson.name} ${chrisEllson.surname}")
    // The following line was an exercise to add leading zeros to the id
    println(chrisEllson.id.toString().padStart(4, '0'))
}