import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
/*
sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }

    test {
        java {
            setSrcDirs(listOf("src/test"))
        }

    }
}
*/

plugins {
    kotlin("jvm") version "1.4.10"
    application
}
group = "me.myuser"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
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
    dependsOn("test")  // 2 ==> CUSTOMIZE THIS LINE
    group = "Git_Actions"      // 3
    description = "$ ./gradlew runOnGitHub # runs on GitHub Action" //3
}

