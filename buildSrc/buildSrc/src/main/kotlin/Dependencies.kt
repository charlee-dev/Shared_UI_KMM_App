object Version {
    const val activity = "1.6.1"
    const val agp = "8.1.0-alpha05"
    const val ballast = "2.3.0"
    const val composeCompiler = "1.3.2"
    const val coroutines = "1.6.4"
    const val jetbrainsCompose = "1.2.2"
    const val jetpackCompose = "1.4.0-alpha04"
    const val junit = "4.13.2"
    const val kermit = "1.1.3"
    const val koin = "3.3.2"
    const val kotlin = "1.8.10"
    const val material = "1.4.0"
    const val mockk = "1.12.4"
    const val settings = "1.0.0-RC"
}

object Android {
    const val agp = "com.android.tools.build:gradle:${Version.agp}"
}

object Ballast {
    const val core= "io.github.copper-leaf:ballast-core:${Version.ballast}"
    const val savedState= "io.github.copper-leaf:ballast-saved-state:${Version.ballast}"
    const val navigation= "io.github.copper-leaf:ballast-navigation:${Version.ballast}"
    const val test = "io.github.copper-leaf:ballast-test:${Version.ballast}"
}

object JetpackCompose {
    const val activity = "androidx.activity:activity-compose:${Version.activity}"
    const val runtime = "androidx.compose.runtime:runtime:${Version.jetpackCompose}"
    const val ui = "androidx.compose.ui:ui:${Version.jetpackCompose}"
    const val foundationLayout =
        "androidx.compose.foundation:foundation-layout:${Version.jetpackCompose}"
    const val material = "androidx.compose.material:material:${Version.jetpackCompose}"
}

object Kotlin {
    const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
    const val coroutinesSwing = "org.jetbrains.kotlinx:kotlinx-coroutines-swing:${Version.coroutines}"
}

object Koin {
    const val core = "io.insert-koin:koin-core:${Version.koin}"
}
object Settings {
    const val common = "com.russhwolf:multiplatform-settings:${Version.settings}"
    const val coroutines = "com.russhwolf:multiplatform-settings-coroutines:${Version.settings}"
}

object Shared {
    const val kermit = "co.touchlab:kermit:${Version.kermit}"
}

object Test {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutines}"
    const val mockk = "io.mockk:mockk:${Version.mockk}"
    const val junit = "junit:junit:${Version.junit}"
}
