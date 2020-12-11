plugins {
    id("org.jetbrains.kotlin.jvm")
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
