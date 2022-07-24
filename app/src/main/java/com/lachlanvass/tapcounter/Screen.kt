package com.lachlanvass.tapcounter

sealed class Screen(val route: String) {
    object HomeScreen: Screen(route = "home_screen")
    object TwoCounterScreen: Screen(route = "two_counter_screen")
}