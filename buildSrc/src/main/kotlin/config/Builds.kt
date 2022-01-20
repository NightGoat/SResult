package config

object Builds {
    const val MIN_VERSION = 19
    const val COMPILE_VERSION = 31
    const val TARGET_VERSION = 31
    const val APP_ID = "com.rasalexman.sresultexample"

    val codeDirs = mutableListOf(
        "src/main/kotlin"
    )

    object App {
        const val VERSION_CODE = 10002
        const val VERSION_NAME = "1.0.2"
    }

    object SResult {
        const val VERSION_CODE = 103035
        const val VERSION_NAME = "1.3.35"
    }
}