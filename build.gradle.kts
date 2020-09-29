import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    kotlin("jvm") version "1.4.10"
    id("org.jetbrains.dokka") version "1.4.10"
    id("org.jlleitschuh.gradle.ktlint") version "9.3.0"
}

group = "me.myuser"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.4.2")
    testImplementation(kotlin("test-junit5"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.test {
    useJUnitPlatform()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

tasks.register("runOnGitHub") { // 1
    dependsOn("test") // 2 ==> CUSTOMIZE THIS LINE
    group = "Git_Actions" // 3
    description = "$ ./gradlew runOnGitHub # runs on GitHub Action" // 3
}

tasks.register("upper") {
    group = "Git_Actions"
    description = "$ ./gradlew runOnGitHub # runs on GitHub Action"
    doLast {
        val someString = "mY_nAmE"
        println("Original: $someString")
        println("Upper case: ${someString.toUpperCase()}")
    }
}

ktlint {
    verbose.set(true)
    outputToConsole.set(true)
    coloredOutput.set(true)
    // add for Arturo
    debug.set(false)
    android.set(false)
    outputColorName.set("RED")
    ignoreFailures.set(false)
    enableExperimentalRules.set(false)
    // End Add
    reporters {
        // reporter(ReporterType.CHECKSTYLE)
        // reporter(ReporterType.JSON)
        reporter(ReporterType.HTML)
    }
    // kotlinScriptAdditionalPaths {
    // include(fileTree("src"))
    // }
    filter {
        exclude("**/style-violations.kt")
        exclude("**/generated/**")
        include("**/kotlin/**")
    }
}
