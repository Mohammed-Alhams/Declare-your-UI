package com.alhams.declareyourui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alhams.declareyourui.domain.WellnessTask
import com.alhams.declareyourui.ui.components.StatefulCounter
import com.alhams.declareyourui.ui.components.WellnessTaskList

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTaskList(tasks = list, onCloseTask = { task -> list.remove(task) })
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}

private fun getWellnessTasks() =
    List(30) { i -> WellnessTask(i, "Task # $i") }
