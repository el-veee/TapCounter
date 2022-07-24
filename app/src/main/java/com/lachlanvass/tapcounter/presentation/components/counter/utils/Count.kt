package com.lachlanvass.tapcounter.presentation.components.counter.utils

import com.lachlanvass.tapcounter.presentation.components.counter.utils.Count.Companion.increment

class Count(var count: Int) {

    companion object {
        fun reset() = 0
        fun Int.increment(): Int = this.inc()
        fun Int.decrement(): Int {
            if (this == 0) {

                return 0
            }

            return this.dec()
        }
    }
}

fun reset() = 0

val x = Count(10)
val a = x.count.increment()