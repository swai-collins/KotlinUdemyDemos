
var name: String?= null

fun showUserInfo(){
    name="Welcome $name"
    println("$name")
}

fun main() {
    name = "Swai"
    println("$name")
    showUserInfo()
    println("$name")
}