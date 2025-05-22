package com.sharmavaibhav.fitnessapp.feature.auth.ui.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {
    val username = mutableStateOf("")
    val email = mutableStateOf("")
    val password = mutableStateOf("")
    val confirmPassword = mutableStateOf("")

    fun register() {
        Log.d("RegistrationViewModel", "Registration attempt with Username: ${username.value}, Email: ${email.value}")
        // Actual registration logic will be implemented later
    }
}
