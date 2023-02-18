plugins {
    id(Plugins.ANDROID_APP)
    id(Plugins.KOTLIN_ANDROID)
}

version = KotlinConfig.version

android {
    namespace = location(Modules.ANDROID)
    compileSdk = AndroidConfig.compile
    defaultConfig {
        applicationId = location(Modules.ANDROID)
        minSdk = AndroidConfig.min
        targetSdk = AndroidConfig.target
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = KotlinConfig.javaVersion
        targetCompatibility = KotlinConfig.javaVersion
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.composeCompiler
    }
}

dependencies {
    implementation(project(Modules.FEATURE_ROOT))

    implementation(Koin.android)
    with(JetpackCompose) {
        api(activity)
        implementation(runtime)
        implementation(ui)
        implementation(foundationLayout)
        implementation(material)
    }
}
