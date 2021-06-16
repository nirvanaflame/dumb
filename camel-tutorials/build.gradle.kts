plugins {
    java
    kotlin("jvm") version "1.5.0"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-common")

    implementation("org.apache.camel:camel-kafka:3.9.0")
    implementation("org.apache.camel:camel-core:3.9.0")

    implementation("org.slf4j:slf4j-simple:1.7.30")

    implementation("org.apache.camel:camel-test:3.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.20-M1")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.5.20-M1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

group = "org.sputik"
version = "1.0-SNAPSHOT"
