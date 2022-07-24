package com.lachlanvass.tapcounter.presentation.components.counter

sealed class CountOperator(val operator: String) {

    object Add: CountOperator("+")
    object Subtract: CountOperator("-")
    object Reset: CountOperator("Reset")

}