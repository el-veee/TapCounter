package com.lachlanvass.tapcounter.presentation.components.counter.utils

interface CounterInterface {

    fun increment(): Unit
    fun decrement(): Unit
    fun reset(): Unit
}