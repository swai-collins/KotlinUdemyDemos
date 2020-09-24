abstract class CreditCard(){
    fun CreditID():String
    {return "2352436dfcdfd"}
}

class UserInfo(): CreditCard(){
    fun getInfo():String{
        return CreditID()
    }
}

fun main() {
    var user = UserInfo()
    println(user.getInfo())
}