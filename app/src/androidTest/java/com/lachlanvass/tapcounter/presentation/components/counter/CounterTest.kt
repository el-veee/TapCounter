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

    @Test
    fun testIncrementsCountUp100() {

        composeTestRule.setContent {
            Counter()
        }

        composeTestRule.onRoot().printToLog("COUNTERTEST")

        val plusButton = composeTestRule
            .onNode(
                hasTestTag(
                    CounterTestTag
                        .PlusButton
                        .tag
                )
            )

        repeat(100) {
            plusButton.performClick()
        }


        composeTestRule
            .onNode(hasTestTag(CounterTestTag.CountValue.tag))
            .assert(hasText("100"))
    }

    @Test
    fun testDecrementFrom10() {

        composeTestRule.setContent {
            Counter()
        }

        val plusButton = composeTestRule
            .onNode(
                hasTestTag(
                    CounterTestTag
                        .PlusButton
                        .tag
                )
            )

        repeat(10) {
            plusButton.performClick()
        }

        composeTestRule
            .onNode(hasTestTag(CounterTestTag.SubtractButton.tag))
            .performClick()

        composeTestRule
            .onNode(hasTestTag(CounterTestTag.CountValue.tag))
            .assert(hasText("9"))
    }

    @Test
    fun testDecrementIsNotNegative() {

        composeTestRule.setContent {
            Counter()
        }

        repeat(10) {

            composeTestRule
                .onNode(hasTestTag(CounterTestTag.SubtractButton.tag))
                .performClick()
        }

        composeTestRule
            .onNode(hasTestTag(CounterTestTag.CountValue.tag))
            .assert(hasText("0"))
    }
}