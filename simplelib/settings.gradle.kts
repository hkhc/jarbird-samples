pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

println("Build with Kotlin build script")

rootProject.apply {
    name = "simplelib"
    buildFileName = "build.gradle.kts"
}

