package com.lachlanvass.tapcounter.presentation.components.counter

fun Int.decrementNotNegative(): Int {

    if (this == 0) return 0
    if (this < 0) throw CannotDecrementNegativeValueException("Cannot decrement already negative value")

    return this.dec()
}

class CannotDecrementNegativeValueException(msg: String): Exception(msg)

fun reset(): Int = 0