fun main(){
    print("Enter grade: ")
    val grade = readLine()!!.toInt()
    if (grade >= 90 ){
        println("A")
    } else if (grade in 80..89){
        println("B")
    } else if (grade in 70..79){
        println("C")
    } else if(grade <= 69){
        println("Fail")
    }
    println("End")
}