package com.alhams.declareyourui.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alhams.declareyourui.ui.theme.DeclareYourUITheme

@Composable
fun App(modifier: Modifier = Modifier) {

    var shouldShowOnboardingScreen by rememberSaveable {
        mutableStateOf(true)
    }

    Surface(modifier) {
        if (shouldShowOnboardingScreen)
            OnboardingScreen(onContinueClick = {
                shouldShowOnboardingScreen = false
            })
        else
            GreetingsList(names = listOf("Android", "Compose"))
    }

}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun AppPreview() {
    DeclareYourUITheme {
        App(modifier = Modifier.fillMaxWidth())
    }
}