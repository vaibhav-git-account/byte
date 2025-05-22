// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    // id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false // Already in app/build.gradle.kts, but good to have a centralized version
}

// It's a common practice to define versions in a central place,
// especially if you were using a libs.versions.toml or ext block.
// For this setup, versions are managed in module-level build.gradle.kts
// or directly here if shared across modules without a version catalog.

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}
