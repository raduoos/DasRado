package com.dasrado.school.kotlin.examples

fun main(args: Array<String>) {
    //helloWorld()
    //functionParameters("Radostin")
    multipleFunctionParameters("Radostin", 19)
}

fun helloWorld() {
    println("Hello World!")
}

fun functionParameters(firstname: String) {
    println(firstname + " Ivanov")
}

fun multipleFunctionParameters(firstname: String, age: Int) {
    println(firstname + " Ivanov" + " is " + age + " years old.")
}