class Player(
    val name: String,
    val surName: String,
    var totalScore: Int = 0,
    var personalBestScore: Int = 0,
) {

    fun fullName(): String {
        return "${this.name} ${this.surName}"
    }
}

class Scores(

) {
    fun compareScores(current: Int, best: Int): Int {
        if(best < current) {
            return current
        }
        return best
    }

    fun tallyScores(player: Player, levelScore: Int, score: Scores) {
        player.totalScore += levelScore
        player.personalBestScore = score.compareScores(levelScore,player.personalBestScore)
    }

    fun displayScores(player: Player, level: Int, levelScore: Int, score: Scores) {
        println("${player.fullName()} Level $level score: $levelScore")
        score.tallyScores(player, levelScore, score)
//        println("${player.fullName()} total score: ${player.totalScore}")
    }

    fun announceWinner(player1: Player, player2: Player) {
        val winner = if(player1.totalScore > player2.totalScore) player1 else player2
        val tiedScore = when(player1.totalScore == player2.totalScore) {
            true -> true
            false -> false
        }

        if(tiedScore) {
            println("The score is tied at ${winner.totalScore} points!")
        } else {
            println("Winner ${winner.fullName()} with a combined score of ${winner.totalScore} " +
                    "and a personal best level score of ${winner.personalBestScore}")
        }
    }
}

fun main() {

    val p1 = Player("Nicola", "Tesla")
    val p2 = Player("Thomas", "Edison")
    val scoring = Scores()

    var currLevel = 1
    var p1LvlScore = (1..100).random()
    scoring.displayScores(p1, currLevel, p1LvlScore, scoring)
    var p2LvlScore = (1..100).random()
    scoring.displayScores(p2, currLevel, p2LvlScore, scoring)

    currLevel = 2
    p1LvlScore = (1..100).random()
    scoring.displayScores(p1, currLevel, p1LvlScore, scoring)
    p2LvlScore = (1..100).random()
    scoring.displayScores(p2, currLevel, p2LvlScore, scoring)

    currLevel = 3
    p1LvlScore = (1..100).random()
    scoring.displayScores(p1, currLevel, p1LvlScore, scoring)
    p2LvlScore = (1..100).random()
    scoring.displayScores(p2, currLevel, p2LvlScore, scoring)

    scoring.announceWinner(p1, p2)

}