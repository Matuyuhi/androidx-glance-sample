package com.matuyuhi.sample.glance.widget

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.provideContent
import com.matuyuhi.sample.glance.ui.theme.WidgetTheme

class MainAppWidgetReceiver(): GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget
        get() = MainAppWidgetImpl()
}



class MainAppWidgetImpl: GlanceAppWidget() {
    override suspend fun onDelete(context: Context, glanceId: GlanceId) {
        super.onDelete(context, glanceId)
    }
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            WidgetTheme {

            }
        }
    }

}