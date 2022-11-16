package com.alhams.declareyourui.domain

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(
    val id: Int,
    val label: String,
    initialCheckedState: Boolean = false
) {
    var checked by mutableStateOf(initialCheckedState)
}