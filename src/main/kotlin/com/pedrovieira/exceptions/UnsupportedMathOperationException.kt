package com.pedrovieira.exceptions

import java.lang.RuntimeException


//Classe de exceptions
class UnsupportedMathOperationException(exception: String?) : RuntimeException(exception) {
}