plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "de.lukaspieper.gcam.services"
    compileSdk = 35

    defaultConfig {
        minSdk = 19
        targetSdk = 35
        versionCode = 8
        versionName = "1.5.2"
    }

    flavorDimensions.add("default")
    productFlavors {
        create("basic") {
            dimension = "default"
            applicationId = "de.lukaspieper.gcam.services"
        }
        create("photos") {
            dimension = "default"
            applicationId = "com.google.android.apps.photos"
        }
        create("photosonly") {
            dimension = "default"
            applicationId = "com.google.android.apps.photos"
        }
    }

    // No benefit outside of Google Play, disabled for IzzyOnDroid
    // https://github.com/lukaspieper/Gcam-Services-Provider/issues/122#issuecomment-1930811074
    dependenciesInfo {
        includeInApk = false
        includeInBundle = false
    }
}
