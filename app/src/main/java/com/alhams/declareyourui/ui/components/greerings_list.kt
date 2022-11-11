package com.alhams.declareyourui.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GreetingsList(
    modifier: Modifier = Modifier,
    names: List<String>
) {
    Column(modifier = modifier.padding(vertical = 4.dp)) {
        for (name in names) {
            Greeting(name = name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingsListPreview(
    names: List<String> = listOf("World", "Compose")
) {
    GreetingsList(names = names)
}
