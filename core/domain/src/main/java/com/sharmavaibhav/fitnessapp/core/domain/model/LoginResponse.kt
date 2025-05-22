package com.sharmavaibhav.fitnessapp.core.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginResponse(
    @Json(name = "user") val user: User?,
    @Json(name = "token") val token: String,
    @Json(name = "success") val success: Boolean,
    @Json(name = "message") val message: String?
)
