plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(28)
    namespace = "com.example.myapp"


    defaultConfig {
        applicationId = "com.technical.myapplication"
        minSdkVersion(19)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    // Since you've specified a buildToolsVersion that is different from the compileSdkVersion,
    // make sure that you actually need to specify the buildToolsVersion. As of recent updates to the Android Gradle Plugin,
    // specifying a buildToolsVersion is often not necessary as the plugin will use a default version.
    // If you do need to specify it, ensure it matches the compileSdkVersion or is a version known to work with it.
    // buildToolsVersion("29.0.1")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.android.gms:play-services-location:18.0.0") // Location dependency
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}
