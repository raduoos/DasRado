package com.dasrado.school.kotlin.exercises

fun main() {
    val numbers = IntArray(5)

    for (i in numbers.indices) {
        print("Enter number ${i + 1}: ")
        numbers[i] = readLine()?.toIntOrNull() ?: 0 // safely read input, defaulting to 0 if invalid
    }

    val sum = numbers.sum()

    println("The sum of the numbers is: $sum")
}

fun main2(){
    val numbers = DoubleArray(5){
        readLine()!!.toDouble()
    }
    println("The sum of the numbers is: ${numbers.sum()}")
}

fun main3(){
    val numbers = DoubleArray(5)

    for (i in numbers.indices) {
        numbers[i] = readLine()!!.toDouble()
    }

    val sum = numbers.sum()
    println("The sum of the numbers is: $sum")
}

fun main4(){
    val array = IntArray(5)
    var sum = 0

    for (i in array.indices) {
        print("Enter number")
        array[i] = readLine()!!.toInt()
        sum += array[i]
    }
    println("The sum of the numbers is: $sum")
}
