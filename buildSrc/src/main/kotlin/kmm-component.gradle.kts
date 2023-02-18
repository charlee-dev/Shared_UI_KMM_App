plugins {
    id("kmm-multiplatform")
}

kotlin {
    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(project(Modules.DATA_USECASE))

                implementation(Ballast.core)
            }
        }
    }
}
