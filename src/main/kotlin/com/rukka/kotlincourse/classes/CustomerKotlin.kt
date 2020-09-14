package com.rukka.kotlincourse.classes

import java.io.IOException

data class CustomerKotlin(var id: Int, var name: String, var email: String?) {
   @JvmField val someField = "Value"

    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$id\", \"name\":  \"$name\"}"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current) {

    }
    @JvmName("preferential") fun makePreferred() {

    }

    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be blank")
        }
    }
}

fun CustomerKotlin.extenrion() {

}

enum class Status {
    Current,
    Past
}