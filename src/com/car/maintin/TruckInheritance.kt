package com.car.maintin


class TruckInheritance:CarClassConstructor{
    var subTypes:String? = null
    constructor(type: String, model: Int,  price:Double,  milesDrive: Int, owner: String, subTypes: String):super(type,model,price,milesDrive,owner){

        this.subTypes = subTypes
    }
    constructor(type: String, model: Int,  price:Double,  milesDrive: Int,subTypes: String):super(type,model,price,milesDrive){
        this.subTypes = subTypes
    }

    override fun getCarPrice():Double{
        return this.getPrice()!! - (this.milesDrive!!.toDouble()*20)
    }

}

fun TruckInheritance.getCarPriceWrapper():Double{
    return this.getCarPrice()
}

fun main() {
    val truck1 =  TruckInheritance("BENZ", 2019,10000.0,105,"John","Dump")
    truck1.type = "Toyota"
    println(truck1.type)
    println(truck1.model)
    println(truck1.getCarPrice())
    println(truck1.getCarPriceWrapper())

    println(truck1.subTypes)

    val truck2=  TruckInheritance("BENZ", 2019,46540.0,765,"Garbage")
    println(truck2.type)
    println(truck2.model)
    println(truck2.getCarPrice())
    println(truck2.subTypes)
}

