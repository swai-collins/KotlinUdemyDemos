

class UserAdmin<T>(credit:T){
    init {
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>) {
    var userAdmin1 = UserAdmin<String>("John")
    var userAdmin2 = UserAdmin<Int>(3242)
    var userAdmin3 = UserAdmin<Double>(88.0)


    display<Int>(22)
}