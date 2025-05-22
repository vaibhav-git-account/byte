# Fitness & Wellness Tracking Android App

## Description

This project is an Android application designed to be a comprehensive fitness and wellness tracker. It aims to support various user types, from individuals managing their own health (Adults, Teens) to those managing dependents (Infants, Toddlers, Kids), and also includes roles for professionals like Admins, Trainers, Nutritionists, and Doctors.

The app will feature:
*   **Databases:** For exercises, food items, supplements, and medicines.
*   **Calculators:** For BMI, BMR, body fat, macronutrient needs, etc.
*   **Planners:** For workouts and meals, with options for users to create their own or use plans from professionals.
*   **Loggers:** Extensive logging capabilities for workouts, meals, body stats, water intake, sleep, mood, habits, medical reports, and health metrics.
*   **Reminders:** For water, meals, workouts, and sleep.
*   **Trackers & Visualizers:** To monitor progress for goals, strength, habits, health metrics, and body composition through graphs and reports.

The backend for this application is planned to be built with Python and Django, hosted at `sharmavaibhav.com`.

## Tech Stack

*   **Language:** Kotlin
*   **UI:** Jetpack Compose
*   **Dependency Injection:** Koin
*   **Networking:** Retrofit
*   **JSON Parsing:** Moshi
*   **Asynchronous Programming:** Kotlin Coroutines & Flow
*   **Navigation:** Jetpack Navigation Compose
*   **Architecture:** Modular (Feature-based) MVVM-like approach

## Modules Structure

The project is organized into the following main modules:

*   `app`: The main application module, responsible for initializing common services (like Koin) and assembling the app.
*   `:core:data`: Handles data sources, including network API services (Retrofit), local database (if implemented later), and repository implementations.
*   `:core:domain`: Contains core business logic, domain models (data classes), and repository interfaces. This layer is independent of Android-specific APIs.
*   `:core:ui`: Holds common UI elements, Jetpack Compose utilities, themes, and shared Composable functions.
*   `:feature:auth`: A feature module dedicated to user authentication (login, registration). Additional feature modules will be created for other distinct functionalities.

## Current Status

*   Initial project structure setup is complete.
*   Basic UI shells and ViewModels for Login and Registration are implemented.
*   Core data models for User and Authentication have been defined.
*   Retrofit and Koin are configured for authentication service calls (currently dummy endpoints).
*   AuthRepository for handling authentication logic is in place.
*   The immediate next steps involve connecting the UI to the repository for dummy authentication calls and then proceeding with implementing live API calls.

---
This README provides a snapshot of the project's intent, technology choices, and current state. It will be updated as development progresses.
