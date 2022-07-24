package com.lachlanvass.tapcounter.presentation.components.counter

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Counter() {

    var counterName by remember {
        mutableStateOf("")
    }

    var count by remember {
        mutableStateOf(0)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {

        TextField(
            value = counterName,
            onValueChange = { counterName = it },
            label = {
                Text("What are you counting?")
            },
        )

        // Counter Value Display
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            TextField(
                value = count.toString(),
                onValueChange = { count = it.toInt() },
                readOnly = true

            )
        }

        // Subtract and Add Buttons

        Row {

            AddSubtractButton(countOperator = CountOperator.Subtract, fun() { count-- })
            AddSubtractButton(countOperator = CountOperator.Add, fun() { count++ })
            AddSubtractButton(countOperator = CountOperator.Reset, fun() { count = 0 })

        }


    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {

    Counter()
}
