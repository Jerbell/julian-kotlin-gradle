plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(Libs.guava)

    testImplementation(Libs.junit)
    testImplementation(Libs.assertj)
}
