package com.rukka.kotlincourse.stdlib

fun main() {
    val element = 1..1_000_000_000_000

    /*val output = element.asSequence().filter { it < 30 }.map { Pair("Yes", it) }
    output.forEach { println(it) }*/

    /*val output = element.asSequence().take(100).sum()
    println(output)*/

    /*val output = element.asSequence().take(30).filter { it < 50 }.map { Pair("Yes", it) }
    output.forEach { println(it) }*/

    val numbers = generateSequence(1) { it + 10 }
    numbers.take(10).forEach { println(it) }

    val lazyInit: Int by lazy { 10 }
}