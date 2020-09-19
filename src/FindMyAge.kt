import java.util.*

fun main(){
    print("Enter DOB: ")
    val DOB = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearInDevice - DOB
    print("You are $age years")
}