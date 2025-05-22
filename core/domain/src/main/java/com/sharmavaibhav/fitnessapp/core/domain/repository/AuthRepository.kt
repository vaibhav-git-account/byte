package com.sharmavaibhav.fitnessapp.core.domain.repository

import com.sharmavaibhav.fitnessapp.core.domain.model.LoginRequest
import com.sharmavaibhav.fitnessapp.core.domain.model.LoginResponse
import com.sharmavaibhav.fitnessapp.core.domain.model.RegistrationRequest
import com.sharmavaibhav.fitnessapp.core.domain.model.RegistrationResponse
import com.sharmavaibhav.fitnessapp.core.domain.util.Result

interface AuthRepository {
    suspend fun login(loginRequest: LoginRequest): Result<LoginResponse>
    suspend fun register(registrationRequest: RegistrationRequest): Result<RegistrationResponse>
}
