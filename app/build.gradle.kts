plugins {
    id("org.jetbrains.kotlin.jvm")
    kotlin("plugin.serialization")
}

repositories {
    mavenCentral()
}

kotlin {
    target.compilations.configureEach {
        kotlinOptions {
            jvmTarget = "11"
            useIR = true
        }
    }
}
dependencies {
    implementation(project(":library"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.0.1")
}
