@file:JvmName("UtilityClass")
package com.rukka.kotlincourse.interop

const val CopyrightYear = 2016
fun prefix(prefix: String, value: String): String {
    return "$prefix-$value"
}