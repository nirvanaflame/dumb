plugins {
    java
    kotlin("jvm") version "1.5.0"
}

group = "org.sputik"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))

    implementation("org.apache.camel:camel-kafka:3.11.0")
    implementation("org.apache.camel:camel-core:3.11.0")

    implementation("org.slf4j:slf4j-simple:1.7.32")

    testImplementation("org.apache.camel:camel-test:3.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
