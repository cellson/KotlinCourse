abstract class SomeAbstractClass {
    abstract fun abstractMethod()
    fun callAbstractTwice() {
        abstractMethod() // You can use abstract methods inside the class, because it is assumed they
        // will be overridden in the child class.
        abstractMethod()
    }
}

class SomeRegularClass : SomeAbstractClass() {
    override fun abstractMethod() {
        println("Calling abstract method")
    }
}

/*
Use-case example of abstract classes
In the following example, there are three classes; AndroidShapeDrawer, WebsiteShapeDrawer and
TerminalShapeDrawer. Each class has a function to draw a line, draw a square and draw a rectangle.
 */

/*
class AndroidShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class WebsiteShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class TerminalShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}
 */

/*
Since square and rectangle can be drawn using lines, you can define an abstract class ShapeDrawer,
that will define methods drawSquare and drawRectangle based on the abstract method drawLine. Now our
drawer classes can inherit from ShapeDrawer and only need to define one function drawLine but will also
have the functionality drawSquare and drawRectangle.
 */

abstract class ShapesDrawer {

    abstract fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int)

    fun drawSquare(x: Int, y: Int, size: Int) {
        drawLine(x, y, x + size, y)
        drawLine(x + size, y, x + size, y + size)
        drawLine(x, y, x, y + size)
        drawLine(x, y + size, x + size, y + size)
    }

    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x, y, x, y + height)
        drawLine(x, y + height, x + width, y + height)
    }
}


class AndroidShapesDrawer: ShapesDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class WebsiteShapesDrawer: ShapesDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class TerminalShapesDrawer: ShapesDrawer() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

fun main() {
    val regular = SomeRegularClass()
    regular.abstractMethod() // Calling abstract method
    regular.callAbstractTwice()
    // Calling abstract method
    // Calling abstract method
}