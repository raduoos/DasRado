package com.dasrado.school.kotlin.exercises

class Books(var title: String, var author: String, var price : Double) {
    fun applyDiscount(discount: Double) {
        price -= price * (discount / 100)
    }

    fun showInfo(){
        println("$title - $author - $price")
    }
}

fun main() {
    val book = Books("The borzoi", "Manel Mendez", 49.99 )
    book.applyDiscount(10.0)
    book.showInfo()
}