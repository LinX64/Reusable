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
    name = "Pixel 3a Light",
    device = "id:pixel_3a_xl",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
)

@Preview(
    name = "Pixel 3a Dark",
    device = "id:pixel_3a_xl",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_UNDEFINED,
)

annotation class MultiThemePreviews
