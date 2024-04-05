package com.client.reusable.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.client.reusablecomponents.previews.DevicePreviews

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MyApp() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Reusable Components")
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            HomeScreen()
        }
    }
}

@DevicePreviews
@Composable
private fun MyAppPreview() {
    MyApp()
}
