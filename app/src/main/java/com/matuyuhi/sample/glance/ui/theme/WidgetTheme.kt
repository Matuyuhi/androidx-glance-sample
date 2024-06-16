package com.matuyuhi.sample.glance.ui.theme

import androidx.compose.runtime.Composable
import androidx.glance.GlanceTheme
import androidx.glance.material3.ColorProviders


@Composable
fun WidgetTheme(
    content: @Composable () -> Unit,
) {
    val colors = ColorProviders(
        light = LightColorScheme,
        dark = DarkColorScheme
    )

    GlanceTheme(colors) {
        content()
    }
}