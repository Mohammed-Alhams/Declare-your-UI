package com.alhams.declareyourui.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alhams.declareyourui.domain.WellnessTask

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    tasks: List<WellnessTask> = remember {
        getWellnessTasks()
    },
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(tasks) { item ->
            WellnessTaskItem(taskName = item.label)
        }
    }


}


@Composable
@Preview
fun WellnessTaskListPreview() {
    WellnessTaskList()
}

private fun getWellnessTasks() =
    List(30) { i -> WellnessTask(i, "Task # $i") }
