import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    kotlin("jvm") version "1.4.10" apply false
    id("com.github.johnrengelman.shadow") version "5.1.0" apply false
}

allprojects {
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.withType<KotlinCompile>().configureEach {
        println("Configuring $name in project ${project.name} to use JVM bytecode 1.8")
        kotlinOptions.jvmTarget = "1.8"
    }

    tasks.withType<Test>().configureEach {
        println("Configuring $name in project ${project.name} to use JUnit")
        useJUnitPlatform()
    }
}
