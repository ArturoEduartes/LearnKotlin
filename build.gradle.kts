import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
sourceSets {
    main {
        java.srcDir(file("src/main/kotlin"))

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
    id("org.jetbrains.dokka") version "1.4.10"
    //application
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
    dependsOn("test")  // 2 ==> CUSTOMIZE THIS LINE
    group = "Git_Actions"      // 3
    description = "$ ./gradlew runOnGitHub # runs on GitHub Action" //3
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