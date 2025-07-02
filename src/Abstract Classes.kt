abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer():ShapeDrawer(){

    override fun drawLine() {
        println("Test code - Draw line for Android platform")
    }
}

class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine() {
        println("Test code - Draw line for Desktop platform")
    }
}

fun main(){
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawRectangle()
}