import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    id(Plugins.KMM_COMPONENT)
    kotlin(Plugins.KOTLIN_NATIVE_COCAPODS)
    id(Plugins.JETBRAINS_COMPOSE)
}

kotlin {
    cocoapods {
        summary = "Shared UI KMM App"
        homepage = "https://github.com/charlee-dev/Shared_UI_KMM_App"
        ios.deploymentTarget = iOSConfig.deploymentTarget
        podfile = project.file("../${Modules.IOS.name()}/Podfile")
        framework {
            baseName = "sharedUi"
            isStatic = true
        }
    }

    targets.withType<KotlinNativeTarget> {
        binaries.all {
            freeCompilerArgs += "-Xdisable-phases=VerifyBitcode"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(Modules.FEATURE_ROOT))
                implementation(project(Modules.FEATURE_ROUTER))
                implementation(project(Modules.FEATURE_LOGIN))
                implementation(project(Modules.FEATURE_BT_LIST))
                implementation(project(Modules.FEATURE_BT_DETAIL))

                with(compose) {
                    implementation(ui)
                    implementation(animation)
                    implementation(animationGraphics)
                    implementation(foundation)
                    implementation(material)
                    implementation(materialIconsExtended)
                    implementation(runtime)
                }
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(Koin.android)
                with(JetpackCompose) {
                    api(activity)
                    implementation(runtime)
                    implementation(ui)
                    implementation(foundationLayout)
                    implementation(material)
                }
            }
        }
    }
}

android {
    namespace = location(Modules.SHARED_UI) + ".android"
}
