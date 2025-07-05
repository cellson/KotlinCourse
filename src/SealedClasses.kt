/*
Sealed classes and when expressions
There is one important consequence of using sealed classes. You might remember that using when as an
expression, you need to specify an else block so that there is always something returned.

fun constructLabel(role: String, name: String): String {
    return when (role) {
        "ceo" -> "The boss"
        "manager" -> "Manager $name"
        "worker" -> name
        else -> "Unknown role"
    }
}

fun main() {
val label = constructLabel("manager", "Leonard")
println(label) // Manager Leonard
}

There are exceptions to this rule. As demonstrated previously, you do not need to specify else if you
when expression with an enum class, and you cover all the possible values.

enum class Role {
    CEO,
    MANAGER,
    WORKER
}

fun constructLabel(role: Role, name: String): String {
    return when (role) {
        CEO -> "The boss"
        MANAGER -> "Manager $name"

Another such exception is when you use when with a sealed class value, and you cover all the possible
subtypes. Take a look at the code below. Since it covers all the possible subtypes of Role in a when
expression, you do not need to specify an else block. It is possible thanks to the sealed modifier.
 */

sealed class Role
class CeoRole(): Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()

fun constructLabel(role: Role): String {
    return when (role) {
        is CeoRole -> "The boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}

fun main() {
    val label = constructLabel(ManagerRole("Leonard"))
    val label2 = constructLabel(WorkerRole("Cletus"))
    val label3 = constructLabel(CeoRole())
    println(label) // Manager Leonard
    println(label2) // Cletus
    println(label3) // The boss
}