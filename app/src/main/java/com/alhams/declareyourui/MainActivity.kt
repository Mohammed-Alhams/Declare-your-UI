package com.alhams.declareyourui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.alhams.declareyourui.ui.components.GreetingsList
import com.alhams.declareyourui.ui.theme.DeclareYourUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeclareYourUITheme {
                Surface(modifier = Modifier.fillMaxHeight()) {
                    GreetingsList(names = List(1000) { "$it" })
                }
            }
        }
    }
}