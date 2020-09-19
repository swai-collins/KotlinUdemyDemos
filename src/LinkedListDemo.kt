import java.util.*

fun main(){
    println("Pets App")

    var listOfPets = LinkedList<String>()
    do {
        print("Enter Pet name or exit to quit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit"){
            listOfPets.add((petName))
        }
    }while (petName != "quit")

    println("Your petsAre using Index")
    for (i in 0 until listOfPets.size){
        println("Pet : ${listOfPets[i]}")
    }
    println("YOur pets Are using Object")
    for (pet in listOfPets){
        println("Pet: $pet")
    }
}