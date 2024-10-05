package com.dasrado.school.kotlin.exercises

fun main(args: Array<String>) {
    println("Introduce a number. And type 0 to finish.")
    var sum = 0
    var num: Int

    do {
        num = readLine()!!.toInt()
        sum += num
    } while (num != 0)

    println("The sum is $sum")
}