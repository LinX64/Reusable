package com.client.reusable.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.client.reusable.R
import com.client.reusable.ui.theme.ReusableTheme
import com.client.reusablecomponents.buttons.PrimaryButton
import com.client.reusablecomponents.buttons.SecondaryButton
import com.client.reusablecomponents.containers.ScrollableScreen
import com.client.reusablecomponents.previews.AppScreenComponent
import com.client.reusablecomponents.previews.MultiThemePreviews
import com.client.reusablecomponents.spacers.FillHeightSpacer
import com.client.reusablecomponents.spacers.HorizontalSpacer

@Composable
fun HomeScreen() {
    Column {
        ScrollableScreen {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Here is the Home Screen!"
            )

            FillHeightSpacer()

            HorizontalSpacer()

            PrimaryButton(text = R.string.app_name, onClick = {})

            HorizontalSpacer()

            PrimaryButton(text = R.string.app_name, onClick = {})

            HorizontalSpacer()

            SecondaryButton(text = R.string.app_name, onClick = {})
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
