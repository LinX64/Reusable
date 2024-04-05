package com.client.reusablecomponents.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SecondaryButton(
    @StringRes text: Int,
    containerColor: Color = Color(0xFFEAECF0),
    contentColor: Color = Color(0xFF999EA9),
    disabledContentColor: Color = Color(0x61000000),
    disabledContainerColor: Color = Color(0x1F000000),
    onClick: () -> Unit
) {
    TextButton(
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp),
        onClick = onClick,
        colors = ButtonColors(
            containerColor = containerColor,
            contentColor = contentColor,
            disabledContentColor = disabledContentColor,
            disabledContainerColor = disabledContainerColor,
        )
    ) {
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
    }
}
