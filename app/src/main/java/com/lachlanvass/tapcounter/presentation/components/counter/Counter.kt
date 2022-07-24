package com.lachlanvass.tapcounter.presentation.components.counter

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lachlanvass.tapcounter.presentation.components.counter.utils.Count

@Composable
fun Counter() {

    var counterName by remember {
        mutableStateOf("")
    }

    var counter by remember {
        mutableStateOf(Count(0).count)
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
                value = counter.toString(),
                onValueChange = { counter = it.toInt() },
                readOnly = true

            )
        }

        // Subtract and Add Buttons

        Row {

            AddSubtractButton(countOperator = CountOperator.Subtract, fun() { counter.decrement() })
            AddSubtractButton(countOperator = CountOperator.Add, fun() { counter.increment() })
            AddSubtractButton(countOperator = CountOperator.Reset, fun() { counter.reset() })

        }


    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {

    Counter()
}
