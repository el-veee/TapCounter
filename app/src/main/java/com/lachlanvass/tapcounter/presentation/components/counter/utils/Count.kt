package com.lachlanvass.tapcounter.presentation.components.counter.utils

class Count(var count: Int): CounterInterface {
    override fun increment() {
        count++
    }

    override fun decrement() {

        // Do not allow count to be lower than zero
        if (count == 0) {
            return
        }

        count--
    }

    override fun reset() {
        count = 0
    }

    override fun toString(): String {
        return count.toString()
    }

}