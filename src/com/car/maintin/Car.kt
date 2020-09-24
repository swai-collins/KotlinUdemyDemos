package com.car.maintin

class Car(var type: String, val model: Int, val price:Double, val milesDrive: Int, val owner: String){
    init {
      println("Object class is created")
    }
    fun getCarPrice():Double{
        return this.price - (this.milesDrive.toDouble()*10)
    }
}

fun main() {
//    val car =  Car("BENZ", 2019,10000.0,105,"Swai")
//    car.type = "Toyota"
//    println(car.type)
//    println(car.model)
//    println(car.getCarPrice())


    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BENZ", 2019,10000.0,105,"Swai"))
    listOfCar.add(Car("Toyota", 2018,15000.0,105,"Onyi"))

    for (car:Car in listOfCar){
        println("-----")
        println(car.owner)
        println(car.getCarPrice())
        println(car.model)
        println(car.type)
    }
}