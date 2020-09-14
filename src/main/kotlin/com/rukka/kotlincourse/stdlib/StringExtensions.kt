package com.rukka.kotlincourse.stdlib

import java.io.File

fun main() {

    val file = File("filename.txt")
    with(file) {
        println(name)
    }

    var string: String? = "Some value"
    string = null
    string?.let {
        println(it.length)
    } ?: run {
        println("string is null")
    }
}