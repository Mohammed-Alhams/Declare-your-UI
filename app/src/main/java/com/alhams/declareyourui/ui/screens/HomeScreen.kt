package com.alhams.declareyourui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alhams.declareyourui.ui.components.StatefulCounter
import com.alhams.declareyourui.ui.components.WellnessTaskList

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier) {
        StatefulCounter()
        WellnessTaskList()
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}