plugins {
    //trick: for the same plugin versions in all sub-modules

    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.androidGradlePlugin) apply false
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.androidGradleLibraryPlugin) apply false
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlinPlugin) apply false
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.multiplatform) apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
