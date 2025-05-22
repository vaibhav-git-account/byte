package com.sharmavaibhav.fitnessapp.core.data.repository

import com.sharmavaibhav.fitnessapp.core.data.network.api.AuthApiService
import com.sharmavaibhav.fitnessapp.core.domain.model.LoginRequest
import com.sharmavaibhav.fitnessapp.core.domain.model.LoginResponse
import com.sharmavaibhav.fitnessapp.core.domain.model.RegistrationRequest
import com.sharmavaibhav.fitnessapp.core.domain.model.RegistrationResponse
import com.sharmavaibhav.fitnessapp.core.domain.repository.AuthRepository
import com.sharmavaibhav.fitnessapp.core.domain.util.Result
import java.io.IOException
import retrofit2.HttpException // For HTTP errors like 4xx, 5xx

class AuthRepositoryImpl(
    private val authApiService: AuthApiService
) : AuthRepository {

    override suspend fun login(loginRequest: LoginRequest): Result<LoginResponse> {
        return try {
            val response = authApiService.login(loginRequest)
            // Assuming the API returns a meaningful success flag in the body,
            // or successful HTTP codes (2xx) imply success.
            // For this example, we rely on LoginResponse.success
            if (response.success && response.user != null) {
                Result.Success(response)
            } else {
                Result.Error(response.message ?: "Login failed: Unknown error")
            }
        } catch (e: HttpException) { // Specific Retrofit/OkHttp exception for HTTP errors
            // You could parse error body here if your API provides structured error messages
            Result.Error("Login failed: ${e.code()} ${e.message()}")
        } catch (e: IOException) { // For network connectivity issues
            Result.Error("Network error: ${e.message ?: "Please check your connection"}")
        } catch (e: Exception) { // For other unexpected errors (e.g., JSON parsing issues if not handled by Moshi)
            Result.Error("Login failed: ${e.message ?: "An unexpected error occurred"}")
        }
    }

    override suspend fun register(registrationRequest: RegistrationRequest): Result<RegistrationResponse> {
        return try {
            val response = authApiService.register(registrationRequest)
            if (response.success) {
                Result.Success(response)
            } else {
                Result.Error(response.message ?: "Registration failed: Unknown error")
            }
        } catch (e: HttpException) {
            Result.Error("Registration failed: ${e.code()} ${e.message()}")
        } catch (e: IOException) {
            Result.Error("Network error: ${e.message ?: "Please check your connection"}")
        } catch (e: Exception) {
            Result.Error("Registration failed: ${e.message ?: "An unexpected error occurred"}")
        }
    }
}
