package com.rukka.kotlincourse.interop

import com.rukka.kotlincourse.classes.CustomerJava

fun main() {
    val customer = CustomerJava()
    customer.email = "mail@gmail.com"
    customer.prettyPrint()

    customer.neverNull()

    val runnable = Runnable { println("Invoking runnable") }
    runnable.run()

    val kr = KotlinCustomerRepo()
    val customerJava = kr.getById(10)
    val id = customerJava.id
}

class PersonKotlin: PersonJava() {

}

class KotlinCustomerRepo: CustomerRepository {
    override fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }

}