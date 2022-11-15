package com.alhams.declareyourui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import com.alhams.declareyourui.ui.components.SootheBottomNavigation
import com.alhams.declareyourui.ui.screens.HomeScreen
import com.alhams.declareyourui.ui.theme.DeclareYourUITheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeclareYourUITheme {
                Scaffold(
                    bottomBar = { SootheBottomNavigation() },

                    ) {
                    HomeScreen()
                }
            }
        }
    }
}