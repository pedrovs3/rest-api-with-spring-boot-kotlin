package com.pedrovieira.controller

import com.pedrovieira.exceptions.UnsupportedMathOperationException
import com.pedrovieira.utils.isNumeric
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class MathController {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    fun sum(
        @PathVariable(value ="numberOne") numberOne: String?,
        @PathVariable(value ="numberTwo") numberTwo: String?
    ): Double {
        println(numberOne)
        println(numberTwo)

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw UnsupportedMathOperationException("Please set a numeric value. Ex: 1.0")
        }

        return numberOne!!.toDouble().plus(numberTwo!!.toDouble())
    }
}