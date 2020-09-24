fun addNumber(x:Double=0.0, y:Double=0.0): Double{
    return x + y
}

fun displayInfo(vararg names:String){
    for (name in names){
        println(name)
    }
}

fun main(){
    println("Start Main Fun")

    var returnAdd = addNumber(3.0, 4.0)
    println("returnAdd: $returnAdd")

    returnAdd = addNumber(x = 5.0,y = 12.0)
    println("returnAdd: $returnAdd")

    returnAdd = addNumber(y = 10.0)
    println("returnAdd: $returnAdd")

    returnAdd = addNumber(10.0)
    println("returnAdd: $returnAdd")

    displayInfo(names = *arrayOf("Onyi","Nditi","Jaymo"))

    println("End Main Fun")


}