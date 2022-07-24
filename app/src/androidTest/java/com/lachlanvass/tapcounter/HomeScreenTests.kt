package com.lachlanvass.tapcounter

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule

class HomeScreenTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule(MainActivity::class.java)
}