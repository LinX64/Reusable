package com.client.reusablecomponents.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.client.reusablecomponents.buttons.PrimaryButton
import com.client.reusablecomponents.containers.CenteredColumn
import io.github.linx64.reusablecomponents.R

@Composable
fun AppScreenComponent(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
    ) {
        CenteredColumn {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppScreenComponentPreview() {
    AppScreenComponent {
        PrimaryButton(text = R.string.ok, onClick = {})
    }
}
