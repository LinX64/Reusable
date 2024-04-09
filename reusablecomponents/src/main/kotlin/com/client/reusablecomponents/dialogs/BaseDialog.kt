package com.client.reusablecomponents.dialogs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.linx64.reusablecomponents.R

@Composable
fun BaseErrorDialog(
    modifier: Modifier = Modifier,
    title: String,
    message: String,
    icon: ImageVector = Icons.Default.Error,
    iconTint: Color = MaterialTheme.colorScheme.error,
    shouldShowDismiss: Boolean = false
) {
    val shouldShowDialog = remember { mutableStateOf(true) }
    if (shouldShowDialog.value) {
        AlertDialog(
            modifier = modifier,
            icon = { Icon(icon, iconTint) },
            title = { Text(text = title) },
            text = { Text(text = message) },
            onDismissRequest = { shouldShowDialog.value = false },
            confirmButton = { ConfirmButton(shouldShowDialog) },
            dismissButton = { DismissButton(shouldShowDismiss, shouldShowDialog) }
        )
    }
}

@Composable
private fun Icon(
    icon: ImageVector,
    iconTint: Color
) {
    Icon(
        modifier = Modifier.size(48.dp),
        imageVector = icon,
        contentDescription = null,
        tint = iconTint
    )
}

@Composable
private fun ConfirmButton(shouldShowDialog: MutableState<Boolean>) {
    TextButton(
        onClick = {
            shouldShowDialog.value = false
        }
    ) {
        Text(text = stringResource(R.string.ok))
    }
}

@Composable
private fun DismissButton(
    shouldShowDismiss: Boolean,
    shouldShowDialog: MutableState<Boolean>
) {
    if (shouldShowDismiss) {
        TextButton(
            onClick = {
                shouldShowDialog.value = false
            }
        ) {
            Text(text = "Dismiss")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BaseErrorDialogPreview() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        BaseErrorDialog(
            title = "Error",
            message = "Please enter valid email and password!"
        )
    }
}
