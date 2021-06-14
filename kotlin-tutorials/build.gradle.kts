plugins {
    kotlin("jvm") version "1.5.20-M1"
//    `java-library`
}

group = "org.sputik"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-common"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
