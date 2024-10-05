package com.dasrado.school.kotlin.examples

fun iff() {
    if (20 > 18){
        println("20 is greater than 18")
    }

    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }
}

fun elsee(){
    val time = 20

    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
}

fun elseif(){
    val time = 22

    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
}