package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4){
            break
        }
    }
}