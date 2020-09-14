package com.rukka.kotlincourse.stdlib

import java.util.*

fun main() {
    val cities = listOf("Madrid", "London", "Paris")
    /*val empty = emptyList<String>()
    println(cities.javaClass)
    println(empty.javaClass)
    val arrayList = Arrays.asList("Madrid", "London")
    println(arrayList.javaClass)*/

    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))
    val characters = charArrayOf('a', 'b')
}