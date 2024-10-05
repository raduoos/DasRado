package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    val myFirstCar = Car()

    myFirstCar.brand = "Audi "
    myFirstCar.model = "A3 "
    myFirstCar.year = 2004

    val mySecondCar = Car()

    mySecondCar.brand = "Audi "
    mySecondCar.model = "RS3 "
    mySecondCar.year = 2025

    print(myFirstCar.brand + myFirstCar.model + "is slower than " + mySecondCar.brand + mySecondCar.model)

}