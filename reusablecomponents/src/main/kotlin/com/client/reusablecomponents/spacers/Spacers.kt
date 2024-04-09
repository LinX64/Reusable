package com.client.reusablecomponents.spacers

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalSpacer() = Spacer(modifier = Modifier.height(16.dp))

/**
 * Spacers for Column
 * @receiver ColumnScope
 */
@Composable
fun ColumnScope.FillHeightSpacer() = Spacer(modifier = Modifier.weight(1f))

/**
 * Spacers for Row
 * @receiver RowScope
 */
@Composable
fun RowScope.FillHeightSpacer() = Spacer(modifier = Modifier.weight(1f))
