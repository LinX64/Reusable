package com.client.reusablecomponents.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.client.reusablecomponents.buttons.PrimaryButton
import io.github.linx64.reusablecomponents.R

@Composable
fun AppComponent(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Surface {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .then(modifier),
        ) {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppPreview() {
    AppComponent {
        PrimaryButton(text = R.string.ok, onClick = {})
    }
}
