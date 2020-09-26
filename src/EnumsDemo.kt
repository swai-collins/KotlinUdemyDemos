

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main() {
    var userDirection = Direction.NORTH

    if (userDirection==Direction.SOUTH){
        println("He went South")
    }else{
        println("I don`t know where he went")
    }
}