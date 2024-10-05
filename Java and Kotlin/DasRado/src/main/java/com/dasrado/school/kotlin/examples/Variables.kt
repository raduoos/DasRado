package com.dasrado.school.kotlin.examples

fun welcomeMessage() {
    var name = "Radu"
    val age: Int = 19

    println("Hello $name. You are $age years old.")
}

fun moreVariables() {
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String
}

fun arithmeticOperators(){
    var x = 100 + 50
    var sum = x + 50
    var sum2 = x + sum + 50
}

fun strings(){
    var greeting = "Hello"
    var greeting2: String = "Hello"

    println(greeting[0]) // This shows the word 0 - H
    println(greeting2.length) // This shows the length of a string
    println(greeting2.uppercase()) // This makes the string uppercase
    println(greeting2.lowercase()) // This makes the string lowercase
    println(greeting2.compareTo(greeting2)) // This compares the string to another one
    println(greeting2.indexOf("lo")) // This shows the location of the letters
}

