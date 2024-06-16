package com.matuyuhi.sample.glance

import android.app.Application
import com.matuyuhi.sample.glance.data.androidModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            androidModule()
        }
    }
}