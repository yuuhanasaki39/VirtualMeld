pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "VirtualMeld"
include(":app-android")
include(":core:platform")
include(":unityLibrary")
include(":features:home")
include(":features:avatar")
