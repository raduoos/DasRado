package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    // Break
    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    // Continue
    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }
}