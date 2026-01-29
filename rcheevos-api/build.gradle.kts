plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(projects.common)

    implementation(libs.kotlin.serialization)
    implementation(libs.okhttp)
}