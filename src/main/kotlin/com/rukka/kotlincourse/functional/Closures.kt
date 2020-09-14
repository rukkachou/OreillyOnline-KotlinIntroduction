package com.rukka.kotlincourse.functional

fun outsideFunction() {
    for (number in 1..30) {
        unaryOperation(20) {
            println(number)
            it * number
        }
    }
}

fun main() {

}

