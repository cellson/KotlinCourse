/*
Default arguments
One very useful Kotlin possibility is to define default arguments. For example, imagine that
you implement a function to open a web browser. However, browsers can be opened in normal or
incognito mode, so, in your function definition, you should have a parameter that specifies
which mode should be used.
 */

fun openBrowser(url: String, incognitoMode: Boolean) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

}

/*
However, in most cases, you do not want this function to specify false for incognito mode.
It should be used by default. To make that possible, you should specify the default value
after the parameter definition.
 */

fun openBrowser2(url: String, incognitoMode: Boolean = false) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

}

/*
You can specify default arguments for all the positions you want. Here is an example function
with default arguments for both its parameters of type String.
 */

fun cheer(how: String = "Hello,", who: String = "World") {

    println("$how $who")
}

fun main() {

    openBrowser("website1.com", false)

    openBrowser("website2.com", false)

    openBrowser("website3.com", true)

    openBrowser2("website1.com")

    openBrowser2("website2.com")

    openBrowser2("website3.com", true)

    cheer() // Hello, World

    cheer("Hi") // Hi World

    cheer("Hi", "Learner")

    /*
    Named arguments
When you call a function inside a parenthesis, you can specify arguments according to the
order of the parameters that are associated. That's the default way of calling a function,
but there is also another option: for each argument, you can explicitly specify what parameter
is associated. You do that by introducing parameter names and the equal sign in front of a
parameter. When you do that, arguments do not need to be in parameter order.
     */

    cheer(how = "Hi") // Hi World

    cheer(who = "Learner") // Hello, Learner

    cheer(how = "Hi", who = "Learner") // Hi Learner

    cheer(who = "Learner", how = "Hi") // Hi Learner
}