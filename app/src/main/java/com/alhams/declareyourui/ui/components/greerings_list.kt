package com.alhams.declareyourui.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GreetingsList(
    modifier: Modifier = Modifier,
    names: List<String>
) {
    LazyColumn(modifier = modifier
        .padding(vertical = 4.dp)
        .fillMaxHeight()) {
        items(items = names) { name ->
            GreetingCard(name = name)
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "Dark"
)
@Composable
fun GreetingsListPreview(
    names: List<String> = List(1000) { "$it" }
) {
    GreetingsList(names = names)
}
