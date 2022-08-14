package com.lachlanvass.tapcounter.presentation.components.counter

sealed class CounterTestTag(val tag: String) {
    object CountValue: CounterTestTag("counter_count_value")
    object PlusButton: CounterTestTag("counter_plus_button")
    object SubtractButton: CounterTestTag("counter_subtract_button")
    object ResetButton: CounterTestTag("counter_reset_button")
}