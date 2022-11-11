package com.alhams.declareyourui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import com.alhams.declareyourui.ui.components.App
import com.alhams.declareyourui.ui.theme.DeclareYourUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeclareYourUITheme {
                App(Modifier.fillMaxWidth())
            }
        }
    }
}