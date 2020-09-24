package com.car.maintin



open class CarClassConstructor(){
    var type:String? = null
    var model:Int? = null
    private var price:Double? = null
    var milesDrive:Int? = null
    var owner:String? = null

    constructor(type: String, model: Int,  price:Double,  milesDrive: Int, owner: String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }
    constructor(type: String, model: Int,  price:Double,  milesDrive: Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }
    init {
        println("Object class is created")
    }
    open fun getCarPrice():Double{
        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }

    fun getPrice():Double{
        return this.price!!
    }
}

fun main() {
    val car1 =  CarClassConstructor("BENZ", 2019,10000.0,105,"Swai")
    car1.type = "Toyota"
    println(car1.type)
    println(car1.model)
    println(car1.getCarPrice())

    val car2=  CarClassConstructor("BENZ", 2019,46540.0,765)
    println(car2.type)
    println(car2.model)
    println(car2.getCarPrice())
}