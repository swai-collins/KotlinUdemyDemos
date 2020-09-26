fun main(){

    for(i in 1..2){
        print("Enter your name: ")
        val name = readLine()!!.toString()
        print("Where you live: ")
        val livePlace = readLine()!!.toString()
        var petName : String? = ""
        print("Enter number of Pets: ")
        val petsCount = readLine()!!.toInt()
        for (petID in 1..petsCount){
            print("Enter Pet $petID: ")
            petName = petName + readLine()!!.toString() + ","
        }

        println("====User Info====")
        println("name: $name")
        println("liveplace: $livePlace")
        println("petName: $petName")
        if (petName!!.contains("Dog")){
            println("great choice")
        }
    }
}