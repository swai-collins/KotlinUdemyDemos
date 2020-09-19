


fun main(){
    var listOfUsers = HashMap<Int, String>()
    listOfUsers[245] = "John"
    listOfUsers[456] = "Messi"
    listOfUsers[353]= "Kevin"

    listOfUsers[245] = "Onyi"

    for (key in listOfUsers.keys)
        println("$key: ${listOfUsers[key]}")
}