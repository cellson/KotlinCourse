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