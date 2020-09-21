

val sum = {number1: Int, number2: Int ->
    number1+number2
}

fun main() {
    val addNumbers = sum(5,8)
    println("addNumbers: $addNumbers")

    println("List of Numbers")
    val listOfNumbers = listOf(10,15,22,34,80)

    listOfNumbers.forEach { number ->
        println(number)
    }
}