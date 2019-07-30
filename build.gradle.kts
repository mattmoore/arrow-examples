plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm").version("1.3.41")
    id("org.jetbrains.kotlin.kapt") version "1.3.41"
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
    maven("https://dl.bintray.com/arrow-kt/arrow-kt/")
    maven("https://oss.jfrog.org/artifactory/oss-snapshot-local/")
}

val arrow_version = "0.9.0-SNAPSHOT"
dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    // Arrow
    compile("io.arrow-kt:arrow-core-data:$arrow_version")
    compile("io.arrow-kt:arrow-core-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-syntax:$arrow_version")
    compile("io.arrow-kt:arrow-typeclasses:$arrow_version")
    compile("io.arrow-kt:arrow-extras-data:$arrow_version")
    compile("io.arrow-kt:arrow-extras-extensions:$arrow_version")
    kapt   ("io.arrow-kt:arrow-meta:$arrow_version")

    // Arrow optional
    compile("io.arrow-kt:arrow-query-language:$arrow_version")
    compile("io.arrow-kt:arrow-free-data:$arrow_version")
    compile("io.arrow-kt:arrow-free-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-mtl:$arrow_version")
    compile("io.arrow-kt:arrow-effects-data:$arrow_version")
    compile("io.arrow-kt:arrow-effects-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-effects-io-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-effects-rx2-data:$arrow_version")
    compile("io.arrow-kt:arrow-effects-rx2-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-effects-reactor-data:$arrow_version")
    compile("io.arrow-kt:arrow-effects-reactor-extensions:$arrow_version")
    // compile("io.arrow-kt:arrow-effects-kotlinx-coroutines-data:$arrow_version")
    // compile("io.arrow-kt:arrow-effects-kotlinx-coroutines-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-optics:$arrow_version")
    compile("io.arrow-kt:arrow-generic:$arrow_version")
    compile("io.arrow-kt:arrow-recursion-data:$arrow_version")
    compile("io.arrow-kt:arrow-recursion-extensions:$arrow_version")
    compile("io.arrow-kt:arrow-query-language:$arrow_version")
    compile("io.arrow-kt:arrow-integration-retrofit-adapter:$arrow_version")
}
