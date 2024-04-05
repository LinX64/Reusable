package com.client.reusablecomponents.previews

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

/**
 * Multi preview annotation that represents 2 themes and 2 devices.
 * Add this annotation to a composable to render various devices with different themes.
 *
 * It supports Light and Dark themes.
 */

@Preview(
    name = "Nexus S",
    device = "id:Nexus S",
    showBackground = true,
)

@Preview(
    name = "Pixel 7",
    device = "id:pixel_7",
    showBackground = true
)

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark theme")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light theme")
annotation class MultiThemePreviews