package com.lachlanvass.tapcounter.presentation.components.counter

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Counter(
    counterValue: Int,
    addCount: () -> Unit,
    subCount: () -> Unit,
    resetCount: () -> Unit
) {

    var counterName by remember {
        mutableStateOf("")
    }

    var count by remember {
        mutableStateOf(counterValue)
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
                value = counterValue.toString(),
                onValueChange = { count = it.toInt() },
                readOnly = true,
                modifier = Modifier
                    .testTag(CounterTestTag.CountValue.tag)

            )
        }

        // Subtract and Add Buttons

        Row {

            AddSubtractButton(
                countOperator = CountOperator.Subtract,
                subCount,
                Modifier.testTag(CounterTestTag.SubtractButton.tag)
            )

            AddSubtractButton(
                countOperator = CountOperator.Add,
                addCount,
                Modifier.testTag(CounterTestTag.PlusButton.tag)
            )

            AddSubtractButton(
                countOperator = CountOperator.Reset,
                resetCount,
                Modifier.testTag(CounterTestTag.ResetButton.tag)
            )

        }


    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {

    var counterValue = 10
    Counter(10,
        { counterValue = counterValue.inc() },
        { counterValue = counterValue.dec() },
        { counterValue = 0 }
    )
}
