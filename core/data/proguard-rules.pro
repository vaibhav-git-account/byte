# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/vaibhavsharma/Library/Android/sdk/tools/proguard/proguard-android-optimize.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If you use reflection or JNI verify the keep options are sufficient.
# Certain library dependencies may require additional keep rules.
#
# -keep class com.google.gson.stream.** { *; }
# -keep class com.google.gson.examples.android.model.** { *; }

# Moshi specific rules
-keep class com.squareup.moshi.* { *; }
-keep @com.squareup.moshi.JsonClass class * { *; }
-keepclassmembers class * {
    @com.squareup.moshi.Json *;
    @com.squareup.moshi.FromJson *;
    @com.squareup.moshi.ToJson *;
}
