/*
Mutable : You can Update
Immutable : You can not update or add more
* */


fun main(){
  //1 - List

    //Immutable
    val listImmutable = listOf("Messi", "Onyi")
    for (name in listImmutable){
        println(name)
    }

    //Mutable
    var listMutable = mutableListOf("Messi", "Onyi")
    listMutable[0] = "Kev"
    for (name in listMutable){
        println(name)
    }
}