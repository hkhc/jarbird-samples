pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

println("Build with Kotlin build script")
println("Fill in the property values in gradle.properties before build.")

include(":app")

rootProject.apply {
    name = "simpleaar"
    buildFileName = "build.gradle.kts"
}
project(":app").apply {
    buildFileName = "build.gradle.kts"
}
