package com.lachlanvass.tapcounter.presentation.components.counter

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AddSubtractButton(
    countOperator: CountOperator,
    clickAction: () -> Unit
) {

    OutlinedButton(
        onClick = clickAction,
        shape = CircleShape,
        border = BorderStroke(1.dp, Color.Black)

    ) {

        Text(
            text = countOperator.operator,
            fontSize = MaterialTheme.typography.button.fontSize
        )
    }

}

@Preview(showBackground = true)
@Composable
fun SubtractButtonPreview() {

    val emptyFun = fun() {}
    AddSubtractButton(CountOperator.Subtract, emptyFun)

}

@Preview(showBackground = true)
@Composable
fun AddButtonPreview() {

    val emptyFun = fun() {}
    AddSubtractButton(CountOperator.Add, emptyFun)

}

@Preview(showBackground = true)
@Composable
fun ResetButtonPreview() {

    val emptyFun = fun() {}
    AddSubtractButton(CountOperator.Reset, emptyFun)

}