package com.dasrado.school.kotlin.exercises

import java.time.LocalDate
import java.util.Calendar

class Car(var brand: String, var model: String, var year: Int) {

    fun showInfo(){
        //val year = 2024 - year
        val calendar = Calendar.getInstance()
        val actualYear = calendar.get(Calendar.YEAR)
        val year = actualYear - year

        print("The year of the $brand $model is: $year")
    }
}

fun main(){
    val myCar = Car("Audi", "A3", 2004)
    myCar.showInfo()
}