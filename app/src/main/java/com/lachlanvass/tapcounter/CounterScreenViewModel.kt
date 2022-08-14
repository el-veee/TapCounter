package com.lachlanvass.tapcounter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterScreenViewModel : ViewModel() {


    var counterOneValue by mutableStateOf(0)
    var counterTwoValue by mutableStateOf(0)

    fun incrementCounterOne() {
        counterOneValue = counterOneValue.inc()
    }

    fun decrementCounterOne() {
        counterOneValue = counterOneValue.dec()
    }

    fun resetCounterOne() {
        counterOneValue = 0
    }

    fun incrementCounterTwo() {
        counterTwoValue = counterTwoValue.inc()
    }

    fun decrementCounterTwo() {
        counterTwoValue = counterTwoValue.dec()
    }

    fun resetCounterTwo() {
        counterTwoValue = 0
    }


}