package com.lachlanvass.tapcounter

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.compose.rememberNavController
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import com.lachlanvass.tapcounter.presentation.components.counter.Counter
import com.lachlanvass.tapcounter.presentation.components.counter.CounterTestTag
import com.lachlanvass.tapcounter.presentation.screens.counterscreen.CounterScreen
import com.lachlanvass.tapcounter.presentation.screens.counterscreen.NumberOfCountersOptions
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test

class ScreenRotationTest {

    @get:Rule
    val composeTestRule = createComposeRule()

//    @BeforeClass
//    fun setup() {
//        composeTestRule.setContent {
//            CounterScreen(
//                numberOfOnScreenCounters = NumberOfCountersOptions.TWO_COUNTER,
//                navHostController = rememberNavController()
//            )
//        }
//    }

    @Test
    fun rotationDoesNotWipeCounterValue() {
//        composeTestRule.setContent {
//            CounterScreen(
//                numberOfOnScreenCounters = NumberOfCountersOptions.TWO_COUNTER,
//                navHostController = rememberNavController()
//            )
//        }

        composeTestRule.setContent {
            Counter()
        }

        composeTestRule
            .onNode(
                hasTestTag(
                    CounterTestTag
                        .PlusButton
                        .tag
                )
            ).also { btn ->
                repeat(5) {

                    btn.performClick()
                }
            }


        val device = UiDevice.getInstance(getInstrumentation())
        device.setOrientationRight()

        composeTestRule
            .onNode(hasTestTag(CounterTestTag.CountValue.tag))
            .assert(hasText("5"))

    }

}