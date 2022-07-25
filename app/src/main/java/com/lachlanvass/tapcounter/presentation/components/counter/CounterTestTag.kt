package com.lachlanvass.tapcounter.presentation.components.counter

sealed class CounterTestTag(val tag: String) {
    object CountValue: CounterTestTag("count_value")
    object PlusButton: CounterTestTag("plus_button")
    object SubtractButton: CounterTestTag("subtract_button")
    object ResetButton: CounterTestTag("reset_button")
}