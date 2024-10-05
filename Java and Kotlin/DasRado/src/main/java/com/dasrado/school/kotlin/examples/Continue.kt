package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    var i = 0

    while (i < 10) {
        if (i == 4){
            i++
            continue
        }
        println(i)
        i++
    }
}