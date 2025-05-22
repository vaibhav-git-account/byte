package com.sharmavaibhav.fitnessapp.di

import com.sharmavaibhav.fitnessapp.core.data.di.networkModule // Import networkModule
import com.sharmavaibhav.fitnessapp.feature.auth.di.authModule
import org.koin.dsl.module

val appModule = module {
    // Include modules from feature modules and core modules
    includes(
        authModule,
        networkModule // Add networkModule here
    )
}
