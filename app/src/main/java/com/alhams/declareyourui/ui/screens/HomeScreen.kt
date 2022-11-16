package com.alhams.declareyourui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alhams.declareyourui.ui.components.StatefulCounter
import com.alhams.declareyourui.ui.components.WellnessTaskList

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTaskList(
            tasks = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task -> wellnessViewModel.removeTask(task) },
        )
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}