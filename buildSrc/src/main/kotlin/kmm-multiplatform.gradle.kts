import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

version = KotlinConfig.version

kotlin {
    android()
    ios()
    iosSimulatorArm64()

    kotlin {
        sourceSets {
            val commonTest by getting
            val commonMain by getting {
                commonTest.dependsOn(this)
                dependencies {
                    implementation(Kotlin.coroutinesCore)
                    implementation(Koin.core)
                }
            }
            val androidTest by getting
            val androidMain by getting {
                androidTest.dependsOn(this)
            }
            val iosTest by getting
            val iosSimulatorArm64Test by getting
            val iosSimulatorArm64Main by getting
            val iosMain by getting {
                this.dependsOn(commonMain)
                iosTest.dependsOn(this)
                iosSimulatorArm64Test.dependsOn(this)
                iosSimulatorArm64Main.dependsOn(this)
            }
        }
    }

        tasks.withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "11"
        }
}

android {
    compileSdk = AndroidConfig.compile
    defaultConfig {
        minSdk = AndroidConfig.min
    }
}
