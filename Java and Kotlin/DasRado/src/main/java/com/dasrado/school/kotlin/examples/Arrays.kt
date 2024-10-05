package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    val cars = arrayOf("Audi", "Mercedes", "Volkswagen", "Porsche")

    println(cars[0])
}

fun changeArrayElement(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    cars[0] = "Opel"
    println(cars[0])
}

fun arrayLength(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    println(cars.size)
}

fun elementCheckExist(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}

fun loopThroughArray(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    for (x in cars) {
        println(x)
    }
}