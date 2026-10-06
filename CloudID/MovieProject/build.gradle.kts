plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ru.mirea.samsonova.lesson9"
    compileSdk {
        version = release(36)
    }
    defaultConfig {
        applicationId = "ru.mirea.samsonova.lesson9"
        minSdk = 33
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(project(":movie-domain"))
    implementation(project(":movie-data"))
    implementation(libs.appcompat)
    implementation(libs.material)
}
