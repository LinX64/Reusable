package com.client.reusablecomponents.previews

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.client.reusablecomponents.buttons.PrimaryButton
import com.client.reusablecomponents.containers.CenteredColumn
import io.github.linx64.reusablecomponents.R

/**
 * A component that wraps the content in a [Surface] and centers the content.
 * The content is placed in a [Column].
 * IMPORTANT: Remember to add your own Theme while using this component.
 */
@Composable
fun AppScreenComponent(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
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
}

@MultiThemePreviews
@Composable
private fun AppScreenComponentPreview() {
    AppScreenComponent {
        PrimaryButton(text = R.string.ok, onClick = {})
    }
}
