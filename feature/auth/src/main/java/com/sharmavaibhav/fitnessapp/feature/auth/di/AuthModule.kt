package com.sharmavaibhav.fitnessapp.feature.auth.di

import com.sharmavaibhav.fitnessapp.feature.auth.ui.viewmodels.LoginViewModel
import com.sharmavaibhav.fitnessapp.feature.auth.ui.viewmodels.RegistrationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val authModule = module {
    viewModel { LoginViewModel() }
    viewModel { RegistrationViewModel() }
}
