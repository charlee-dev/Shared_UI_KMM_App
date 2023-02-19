pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "Shared_UI_KMM_App"

include(
    ":androidApp",
)
include(
    ":sharedUi",
)
include(
    ":feature:root",
    ":feature:router",
    ":feature:login",
    ":feature:bt:list",
    ":feature:bt:detail",
)
include(
    ":usecase",
)
include(
    ":hardware:bt",
    ":hardware:location",
)
include(
    ":data:sdk",
    ":data:local",
    ":data:remote",
)
