package com.lachlanvass.tapcounter

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lachlanvass.tapcounter.presentation.components.counterscreen.CounterScreen
import com.lachlanvass.tapcounter.presentation.components.counterscreen.NumberOfCountersOptions

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {

    NavHost(
        navController = navHostController,
        startDestination = Screen.HomeScreen.route
    ) {

        composable(
            route = Screen.HomeScreen.route
        ) {
            CounterScreen(
                numberOfOnScreenCounters = NumberOfCountersOptions.ONE_COUNTER,
                navHostController = navHostController
            )
        }

        composable(
            route = Screen.TwoCounterScreen.route
        ) {
            CounterScreen(
                numberOfOnScreenCounters = NumberOfCountersOptions.TWO_COUNTER,
                navHostController = navHostController)
        }
    }
}