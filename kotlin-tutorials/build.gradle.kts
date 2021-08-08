plugins {
    kotlin("jvm") version "1.5.20-M1"
}

group = "org.sputik"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.5.21")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.21")
}

tasks.test {
    useJUnitPlatform()
}
