package com.lachlanvass.tapcounter.presentation.components.counter.utils

interface CountManager {

    fun increment(): Int
    fun decrement(): Int
    fun reset(): Int
}

open class NegativeCountManager(open var count: Int = 0): CountManager {

    override fun increment(): Int = count.inc()

    /**
     * Decrements a count value. Allows value into negatives
     */
    override fun decrement(): Int = count.dec()

    override fun reset(): Int = 0
}


class PositiveCountManager(override var count: Int = 0): NegativeCountManager() {

    /**
     * Decrements a count value. Blocks negative values
     */
    override fun decrement(): Int {

        if (this.count == 0) return 0

        return super.decrement()

    }

}