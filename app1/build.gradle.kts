plugins {
    kotlin("jvm")
	id("com.github.johnrengelman.shadow")
    application
}

group = "com.julianbell.app1"

application {
    mainClassName = "app1.Main"
}

dependencies {
    implementation(project(":shared"))
    implementation(kotlin("stdlib-jdk8"))
    implementation(Libs.guava)

    testImplementation(project(":shared"))
    testImplementation(Libs.junit)
    testImplementation(Libs.assertj)
}
