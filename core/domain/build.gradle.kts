plugins {
    id("com.android.library") // Or `java-library` or `kotlin` if no Android resources/manifest needed
    id("org.jetbrains.kotlin.android") // Or `kotlin` if not an Android library
    id("com.google.devtools.ksp")
}

android { // Remove this block if not an Android library
    namespace = "com.sharmavaibhav.fitnessapp.core.domain"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        // testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" // Only if you have Android tests
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0") // Or remove if pure Kotlin/Java
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") // For suspend functions in use cases

    // Moshi for JSON parsing
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.15.0")

    // Testing
    testImplementation("junit:junit:4.13.2")
    //androidTestImplementation("androidx.test.ext:junit:1.1.5") // Only if you have Android tests
    //androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1") // Only if you have Android tests
}
