plugins {
    id "com.android.application"
    id "org.jetbrains.kotlin.android"
    id "com.google.gms.google-services"
}

android {
    namespace "com.example.saguia"
    compileSdk 34

    defaultConfig {
        applicationId "com.example.saguia"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib:1.9.0"
    implementation platform('com.google.firebase:firebase-bom:33.2.0')
    implementation 'com.google.firebase:firebase-analytics'
}