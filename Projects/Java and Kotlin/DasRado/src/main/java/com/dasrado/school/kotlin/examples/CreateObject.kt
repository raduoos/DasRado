package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    val myCar = Car()

    myCar.brand = "Audi "
    myCar.model = "RS3 "
    myCar.year = 2025

    print(myCar.brand)
    print(myCar.model)
    print(myCar.year)
}