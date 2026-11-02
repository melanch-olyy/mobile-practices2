plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ru.mirea.samsonova.scrollviewapp"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "ru.mirea.samsonova.scrollviewapp"
        minSdk = 33
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
}
