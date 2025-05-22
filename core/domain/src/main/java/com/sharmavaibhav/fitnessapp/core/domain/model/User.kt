package com.sharmavaibhav.fitnessapp.core.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "id") val id: String,
    @Json(name = "email") val email: String,
    @Json(name = "username") val username: String?,
    @Json(name = "auth_token") val authToken: String? // This might be better in LoginResponse
)
