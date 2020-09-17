fun main(){
    println("Pets App")
    println("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()

    var listOfPets: Array<String> = Array(maxSize){""}
    for (i in 0 until maxSize){
        print("Enter Pet name $i:")
        listOfPets[i] = readLine()!!.toString()
    }

    println("YOur petsAre using Array")
    for (i in 0 until maxSize){
        println("Pet $i: ${listOfPets}")
    }
}