package com.example.composenewsclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.composenewsclient.ui.theme.ComposeNewsClientTheme
import com.example.composenewsclient.ui.theme.MainScreen

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<NewsFeedViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNewsClientTheme {
                MainScreen()
            }
        }
    }
}
