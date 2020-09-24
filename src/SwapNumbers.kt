fun main(){
    print("Enter Number1: ")
    var number1 =  readLine()!!.toInt()
    print("Enter Number2: ")
    var number2 = readLine()!!.toInt()

    val temp = number1
    number1 = number2
    number2 = temp


    println("Number1: $number1, Number2: $number2")
}