fun main(){
    print("Pick food menu: ")
    val foodID = readLine()!!.toInt()
    when(foodID){
        1 -> {
            println("You got sandwitch")
            println("You got salad")
        }
        10 -> {
            println("You got burger")
        }else ->{
        println("You got nothing")
    }
    }
}