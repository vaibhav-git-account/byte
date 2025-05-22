package com.sharmavaibhav.fitnessapp.feature.auth.ui.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val email = mutableStateOf("")
    val password = mutableStateOf("")

    fun login() {
        Log.d("LoginViewModel", "Login attempt with Email: ${email.value}, Password: ${password.value}")
        // Actual login logic will be implemented later
    }
}
