package com.lachlanvass.tapcounter.countmanager

import com.lachlanvass.tapcounter.presentation.components.counter.utils.NegativeCountManager
import org.junit.Test
import org.assertj.core.api.Assertions.*

class NegativeCountManagerTest {

    private val countManager = NegativeCountManager(0)

    @Test
    fun `Resetted count has value 0`() {
        val count = countManager.reset()

        assertThat(count)
            .isEqualTo(0)
    }

    @Test
    fun `Increment count by 1 returns count of 1`() {
        var count = countManager.count

        count = countManager.increment()
        assertThat(count)
            .isEqualTo(1)
    }

}