package com.lachlanvass.tapcounter.presentation.components.counter


import org.junit.Test
import org.junit.Assert.*

class ExtensionsKtTest {

    @Test
    fun `Decrements value from 10 to 9`() {

        val original = 10

        assertEquals(9, original.decrementNotNegative())
    }

    @Test
    fun `decrementNotNegative returns 0 after calling on 0`() {

        val original = 0

        assertEquals(0, original.decrementNotNegative())
    }

    @Test
    fun `decrementNotNegative throws error calling on negative value`() {

        val original = -1

        assertThrows(CannotDecrementNegativeValueException::class.java) {
            original.decrementNotNegative()
        }

    }

    @Test
    fun `resets any int value to 0`() {

        for (i in 1..1000 ) {
            val new = reset()
            assertEquals(0, new)

        }
    }
}