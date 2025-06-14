fun main() {

    val weekday = "Friday"
//    val hours = when (weekday) {
//        "Monday" -> "8 AM to 12 PM"
//        "Tuesday", "Wednesday", "Thursday" -> "8 AM to 6 PM"
//        "Friday" -> "8 AM to 9 PM"
//        "Saturday" -> "9 AM to 4 PM"
//        "Sunday" -> "8 AM to 4 PM"
//        else -> "unknown"
//    }
    println("On $weekday, the opening hours are:")

    if (weekday == "Monday") {
        println("8 AM to 12 PM")
    } else if (
        weekday == "Tuesday" ||
        weekday == "Wednesday" ||
        weekday == "Thursday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Friday") {
        println("8 AM to 9 PM")
    } else if (weekday == "Saturday") {
        println("9 AM to 4 PM")
    } else println("8 AM to 4 PM")

    val hour = 20

    val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }

    if (isOpen) {
        println("Little Lemon is open now")
    } else
        println("Little Lemon is closed now")

}