
class Outer{
    private val name:String? = null

    class Nested{
        fun Show(){
            println("Nested")
        }
    }
}

fun main(args:Array<String>) {
    var outer=Outer()
    var nested = Outer.Nested()
    nested.Show()
}