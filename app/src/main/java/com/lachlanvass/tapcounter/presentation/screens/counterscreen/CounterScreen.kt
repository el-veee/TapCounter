package com.lachlanvass.tapcounter.presentation.screens.counterscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lachlanvass.tapcounter.Screen
import com.lachlanvass.tapcounter.presentation.components.counter.Counter

@Composable
fun CounterScreen(
    numberOfOnScreenCounters: NumberOfCountersOptions,
    navHostController: NavHostController
) {

    val navRoute = when(numberOfOnScreenCounters) {

        NumberOfCountersOptions.ONE_COUNTER -> Screen.TwoCounterScreen.route
        NumberOfCountersOptions.TWO_COUNTER -> Screen.HomeScreen.route
    }

    val navButtonMessage = when (numberOfOnScreenCounters) {
        NumberOfCountersOptions.ONE_COUNTER -> CounterNavStringOption.ADD_COUNTER
        NumberOfCountersOptions.TWO_COUNTER -> CounterNavStringOption.REMOVE_COUNTER
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        Column(
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            repeat(numberOfOnScreenCounters.numberOfCounters) {
                Counter()
            }

            Button(onClick = {
                navHostController.navigate(route = navRoute)
            }) {

                Text(
                    text = navButtonMessage.message,
                    color = MaterialTheme.colors.secondary,
                    fontSize = MaterialTheme.typography.button.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }

        }

    }

}

@Composable
@Preview(showBackground = true)
fun CounterScreenPreview() {

    CounterScreen(
        numberOfOnScreenCounters = NumberOfCountersOptions.ONE_COUNTER,
        navHostController = rememberNavController())
}

@Composable
@Preview(showBackground = true)
fun TwoCounterScreenPreview() {

    CounterScreen(
        numberOfOnScreenCounters = NumberOfCountersOptions.TWO_COUNTER,
        navHostController = rememberNavController())
}