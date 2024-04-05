package com.client.reusablecomponents.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.client.reusablecomponents.buttons.PrimaryButton
import io.github.linx64.reusablecomponents.R

/**
 * A component that wraps the content in a [Surface] and applies padding.
 * The content is placed in a [Column].
 * IMPORTANT: Remember to add your own Theme while using this component.
 */
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

@MultiThemePreviews
@Composable
private fun AppPreview() {
    AppComponent {
        PrimaryButton(text = R.string.ok, onClick = {})
    }
}
