package com.alhams.declareyourui.ui.screens

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.alhams.declareyourui.domain.WellnessTask

class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun removeTask(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(
        item: WellnessTask,
        checked: Boolean
    ) {
        tasks.find { it.id == item.id }?.let {
            it.checked = checked
        }
    }

    private fun getWellnessTasks() =
        List(30) { i -> WellnessTask(i, "Task # $i") }
}