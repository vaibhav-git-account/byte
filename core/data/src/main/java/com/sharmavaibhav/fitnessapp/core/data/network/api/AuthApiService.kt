package com.sharmavaibhav.fitnessapp.core.data.network.api

import com.sharmavaibhav.fitnessapp.core.domain.model.LoginRequest
import com.sharmavaibhav.fitnessapp.core.domain.model.LoginResponse
import com.sharmavaibhav.fitnessapp.core.domain.model.RegistrationRequest
import com.sharmavaibhav.fitnessapp.core.domain.model.RegistrationResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {
    @POST("api/auth/login") // Use a placeholder endpoint
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @POST("api/auth/register") // Use a placeholder endpoint
    suspend fun register(@Body request: RegistrationRequest): RegistrationResponse
}
