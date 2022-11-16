package com.alhams.declareyourui.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alhams.declareyourui.domain.WellnessTask

@Composable
fun WellnessTaskList(
    tasks: List<WellnessTask>,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = tasks, key = { task -> task.id }) { item ->
            WellnessTaskItem(
                title = item.label,
                checked = item.checked,
                onCheckedChange = { checked -> onCheckedTask(item, checked) },
                onClose = { onCloseTask(item) },
            )
        }
    }


}


@Composable
@Preview
fun WellnessTaskListPreview() {
    WellnessTaskList(
        tasks = emptyList(),
        onCloseTask = {},
        onCheckedTask = { task, checked -> }
    )
}

