package com.rukka.kotlincourse.functional

fun String.hello() {
    println("It's me!")
}
fun String.toTileCase(prefix: String): String {
    return this.split(" ").joinToString("") { "$prefix${it.capitalize()}" }
}

fun main() {
    /*"Hello".hello()
    val strings = "this is a sample string to Title Case it"
    println(strings.toTileCase("*"))*/

    Customer().makePreferred("My new version")

    val instance1: BaseClass = InheritedClass()
    instance1.extension()
    val instance2 = InheritedClass()
    instance2.extension()
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}
fun Customer.makePreferred(message: String) {
    println("Extended version: $message")

}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}
fun InheritedClass.extension() {
    println("Inherited extension")
}