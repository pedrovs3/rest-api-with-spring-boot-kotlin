package com.pedrovieira.utils

import kotlin.reflect.typeOf

fun isNumeric(strNumber: String?): Boolean {
    if(strNumber.isNullOrBlank()) return false

    val number = strNumber.replace(",".toRegex(), ".")

    return number.matches("""[-+]?[0-9]*\.?[0.9]+""".toRegex())
}