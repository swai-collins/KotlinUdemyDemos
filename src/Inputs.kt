fun main(){
    print("Enter Name: ")
    val name = readLine()!!.toString()
    print("Enter Age: ")
    val age =  readLine()!!.toInt()

    println("==== User info ====")
    println("Name: $name")
    println("Age: $age")
}