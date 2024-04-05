package com.client.reusable.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.client.reusable.R
import com.client.reusable.ui.theme.ReusableTheme
import com.client.reusablecomponents.buttons.PrimaryButton
import com.client.reusablecomponents.containers.CenteredColumn
import com.client.reusablecomponents.previews.AppScreenComponent
import com.client.reusablecomponents.previews.MultiThemePreviews
import com.client.reusablecomponents.spacers.FillHeightSpacer

@Composable
fun HomeScreen() {
    Column {
        CenteredColumn {
            Text(text = "Buttons")

            Spacer(modifier = Modifier.height(16.dp))

            FillHeightSpacer()

            PrimaryButton(text = R.string.app_name, onClick = {})
        }
    }
}

@MultiThemePreviews
@Composable
private fun HomePreview() {
    ReusableTheme {
        AppScreenComponent {
            HomeScreen()
        }
    }
}
