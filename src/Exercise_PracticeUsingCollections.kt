class Comment(
    val userId: Int,
    val message: String
)

val comments: List<Comment> = listOf(
    Comment(5241, "Nice code"),
    Comment(6624, "Like it"),
    Comment(5224, "What's going on?"),
    Comment(9001, "Check out my website"),
    Comment(8818, "Hello everyone, :)")
)

val blockedUserIds: Set<Int> = setOf(5224, 9001)

val userIdToRelation: Map<Int, String> = mapOf(
    5241 to "Friend",
    6624 to "Work Colleague"
)

fun displayComments(comments: List<Comment>, blockedUserIds: Set<Int>, userIdToRelation: Map<Int, String>) {
    for (item in comments) {
        if (item.userId !in blockedUserIds) {
            if (userIdToRelation.contains(item.userId)) {
                println("Comment: ${item.message} from ${userIdToRelation[item.userId]}")
            } else {
                println("Comment: ${item.message} from unknown")
            }
        }
    }
}

fun cleanerDisplayComments(
    comments: List<Comment>,
    blockedUserIds: Set<Int>,
    userIdToRelation: Map<Int, String>
) {
    comments
        .filter{it.userId !in blockedUserIds}
        .map{comment ->
            val relation=userIdToRelation[comment.userId]?:"unknown"
            "Comment: ${comment.message} from $relation" }
        .forEach{println(it)}
}

fun main() {
    displayComments(comments, blockedUserIds, userIdToRelation)

    for (comment in comments) {
        if (comment.userId !in blockedUserIds) {
            val relation = userIdToRelation[comment.userId] ?: "unknown"
            println("Comment: ${comment.message} from $relation")
        }
    }
}