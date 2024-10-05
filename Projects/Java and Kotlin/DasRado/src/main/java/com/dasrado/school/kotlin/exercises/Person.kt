package com.dasrado.school.kotlin.exercises

class Person(val name: String, val age: Int, val country: String) {
    fun showInfo(){
        println("You are $name, you are $age years old and you are from $country.")
    }
}

fun main(){
    val person = Person("Radostin", 19, "Bulgaria")
    person.showInfo()
}
