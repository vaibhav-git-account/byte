package com.sharmavaibhav.fitnessapp

import android.app.Application
import com.sharmavaibhav.fitnessapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger() // Use androidLogger for Koin logging
            androidContext(this@MainApplication) // Provide Android context
            modules(appModule) // Your Koin modules
        }
    }
}
