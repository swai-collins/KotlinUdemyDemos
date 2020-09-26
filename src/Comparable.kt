import java.util.*

class Person(var  name:String, var  age:Int):Comparable<Person>{

    override fun compareTo(other: Person):Int{
        return this.age - other.age
    }
}

fun main(args:Array<String>) {
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("John", 24))
    listOfNames.add(Person("Collins", 27))
    listOfNames.add(Person("Mike", 25))

    println("Before sort")
    for (person in listOfNames){
        println("Name:" +person.name)
        println("Name:" +person.age)
    }
    println("After sort")
    listOfNames.sort()
    for (person in listOfNames){
        println("Name:" +person.name)
        println("Name:" +person.age)
    }
}