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

rootProject.apply {
    name = "simplelib-sign"
    buildFileName = "build.gradle.kts"
}

