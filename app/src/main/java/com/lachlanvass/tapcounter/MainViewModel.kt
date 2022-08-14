package com.lachlanvass.tapcounter

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    var counterOneValue = 0
    var counterTwoValue = 0

    fun incrementCounterOne() {
        counterOneValue = counterOneValue.inc()
    }

    fun incrementCounterTwo() {
        counterTwoValue = counterTwoValue.inc()
    }

}