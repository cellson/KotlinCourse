fun main() {
    println(123 + 456 * 789)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    println(13530.0 / 1.23)
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println("Total Score: $totalScore")
    println("Average Score: $averageScore")

    val boostMultiplier = 4
    val scoreBoost: Int = boostMultiplier * totalScore
    val finalBoostedScore: Int = totalScore + scoreBoost

    println("Score Boost: $scoreBoost")
    println("Final Boosted Score: $finalBoostedScore")
}