package com.client.reusable.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.client.reusable.R
import com.client.reusablecomponents.buttons.PrimaryButton
import com.client.reusablecomponents.containers.CenteredColumn
import com.client.reusablecomponents.preview.AppScreenComponent

@Composable
fun HomeScreen() {
    Column {
        CenteredColumn {
            Text(text = "Buttons")

            Spacer(modifier = Modifier.height(16.dp))

            PrimaryButton(text = R.string.app_name, onClick = {})
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomePreview() {
    AppScreenComponent {
        HomeScreen()
    }
}
