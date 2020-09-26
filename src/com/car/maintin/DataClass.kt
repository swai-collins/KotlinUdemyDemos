package com.car.maintin

data class Person(val name:String, val age:Int, val gender:String)

fun main() {
    val person = Person("Collins", 25, "Male")
    println("person.name: ${person.name}")
    println("person.age: ${person.age}")
    println("person.gender: ${person.gender}")
}