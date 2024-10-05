package com.dasrado.school.kotlin.examples

class Truck {
    var brand = ""
    var model = ""
    var year = 0
}

class Van(var brand: String, var model: String, var year: Int)


fun main() {
    val truck = Truck()
    truck.brand = "Mercedes-Benz "
    truck.model = "TQE "
    truck.year = 2030

    val van = Van("Mercedes-Benz ", "EQCRV ", 2030)
    println(van.brand + van.model + van.year)
}

