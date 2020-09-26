import java.lang.Exception

fun main(args:Array<String>) {
   try {
       print("Enter N2:")
       var n2:Int = readLine()!!.toInt()
       var Div = 100
       println("Div: $Div")
   }catch (ex:Exception){
       println(ex.message)
   }

    println("App is done")


}