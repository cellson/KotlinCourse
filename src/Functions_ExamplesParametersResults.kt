fun printStars(num: Int) {
    for (i in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (stars in 1..height) {
        printStars(stars)
    }
}

fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars(stars)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun biggerOf2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun biggerOf3(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println("Ascending Triangle:")
    ascendingTriangle(5)
    println("Descending Triangle")
    descendingTriangle(5)
    println("Isosceles Triangle")
    isoscelesTriangle(5)

    val area: Double = triangleArea(1.0, 2.0)
    println(area) // 1.0
    println(triangleArea(2.0, 2.0)) // 2.0
    println(triangleArea(5.0, 5.0)) // 12.5
    println(triangleArea(10.0, 20.0)) // 100.0

    println(biggerOf(3,1)) // 3
    println(biggerOf(10,20)) // 20
    println(biggerOf2(23,24)) // 24
    println(biggerOf3(50,100)) // 100
}