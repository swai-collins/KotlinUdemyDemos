fun main(){
    print("Enter age: ")
    val age = readLine()!!.toInt()

    if (age >= 18){
        println("Drink Beer")
    }
    else{
        println("Go home")
    }
    print("End")
}