import org.gradle.api.JavaVersion

object AndroidConfig {
    const val id = "com.adrianwitaszak.shareduikmmapp"
    const val min = 21
    const val compile = 33
    const val target = compile
    const val versionCode = 1
    const val versionName = "1.0"
}

object iOSConfig {
    const val deploymentTarget = "11.0"
}

object KotlinConfig {
    const val version = "0.0.1"
    const val jvmTarget = "11"
    val javaVersion = JavaVersion.VERSION_11
}

object SqlDelightConfig {
    const val databaseName = "shareduikmmapp"
    val packagename = "${location(Modules.DATA_LOCAL)}.cache"
}
