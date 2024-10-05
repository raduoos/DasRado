package com.dasrado.school.kotlin.exercises

fun main(args: Array<String>) {
    var number = readLine()!!.toInt()

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}