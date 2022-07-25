package com.lachlanvass.tapcounter.presentation.components.counter

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class CounterTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testIncrementsCountByOne() {

        composeTestRule.setContent {
            Counter()
        }

        composeTestRule.onRoot().printToLog("COUNTERTEST")

        composeTestRule
            .onNode(hasTestTag(CounterTestTag.PlusButton.tag))
            .performClick()

        composeTestRule
            .onNode(hasTestTag(CounterTestTag.CountValue.tag))
            .assert(hasText("1"))
    }
}