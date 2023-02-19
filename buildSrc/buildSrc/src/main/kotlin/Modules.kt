object Modules {
    const val ANDROID = ":android"
    const val IOS = ":iosApp"
    const val BACKEND = ":backend"

    const val SHARED_UI = ":sharedUi"

    const val FEATURE_ROOT = ":feature:root"
    const val FEATURE_ROUTER = ":feature:router"
    const val FEATURE_LOGIN = ":feature:login"
    const val FEATURE_BT_LIST = ":feature:bt:list"
    const val FEATURE_BT_DETAIL = ":feature:bt:detail"

    const val USECASE = ":usecase"

    const val HARDWARE_BT = ":hardware:bt"
    const val HARDWARE_LOCATION = ":hardware:location"

    const val DATA_SDK = ":data:sdk"
    const val DATA_REMOTE = ":data:remote"
    const val DATA_LOCAL = ":data:local"
}

fun String.name() = drop(1).replace(":", ".")

fun location(moduleName: String) = AndroidConfig.id + moduleName.name()
