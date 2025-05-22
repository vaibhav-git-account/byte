package com.sharmavaibhav.fitnessapp.core.data.di

import com.sharmavaibhav.fitnessapp.core.data.network.api.AuthApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val networkModule = module {

    // HttpLoggingInterceptor
    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY // Or Level.BASIC for less verbosity
        }
    }

    // OkHttpClient
    single {
        OkHttpClient.Builder()
            .addInterceptor(get<HttpLoggingInterceptor>()) // Inject the logger
            // Add other interceptors if needed (e.g., for auth tokens later)
            .build()
    }

    // Moshi
    single {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory()) // For Kotlin data classes
            .build()
    }

    // Retrofit
    single {
        Retrofit.Builder()
            .baseUrl("http://sharmavaibhav.com/") // The base URL (placeholder)
            .client(get<OkHttpClient>()) // Inject OkHttpClient
            .addConverterFactory(MoshiConverterFactory.create(get<Moshi>())) // Inject Moshi
            .build()
    }

    // AuthApiService
    single {
        get<Retrofit>().create(AuthApiService::class.java)
    }

    // AuthRepository
    single<com.sharmavaibhav.fitnessapp.core.domain.repository.AuthRepository> {
        com.sharmavaibhav.fitnessapp.core.data.repository.AuthRepositoryImpl(get()) // get() will resolve AuthApiService
    }
}
