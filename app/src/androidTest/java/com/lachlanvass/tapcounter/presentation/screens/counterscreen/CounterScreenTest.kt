package com.lachlanvass.tapcounter.presentation.screens.counterscreen

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.compose.rememberNavController
import org.junit.BeforeClass
import org.junit.Rule

class CounterScreenTest {
    
    @get:Rule
    val composeTestRule = createComposeRule()
    
    @BeforeClass
    fun setup() {
        composeTestRule.setContent { 
            CounterScreen(
                numberOfOnScreenCounters = NumberOfCountersOptions.TWO_COUNTER,
                navHostController = rememberNavController())
        }
    }

//    @Test
//    fun twoCountersAreVisible() {
//        composeTestRule
//            .onNode(hasTestTag(CounterTestTag.CountValue.tag))
//            .exi
//    }
}