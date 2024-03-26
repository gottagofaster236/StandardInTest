plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}
application {
    mainClass.set("MainKt") // The main class of the application
}
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
