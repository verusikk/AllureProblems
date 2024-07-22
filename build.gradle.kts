import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm").version("1.9.23")
    kotlin("plugin.spring").version("1.9.23")
    id("io.qameta.allure").version("2.11.2")
    id("org.springframework.boot").version("3.2.5")
    id("io.spring.dependency-management").version("1.1.4")
}

group = "com.azul.testing"


repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.gradle.org/gradle/libs-releases") }
    mavenLocal()
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation(platform("io.qameta.allure:allure-bom:2.25.0"))
    testImplementation("io.qameta.allure:allure-junit5")
    testImplementation("org.junit.platform:junit-platform-engine:1.11.0-M2")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17" // allure plugin doesn't work well with java21
    }
}
tasks.withType<JavaCompile> {
    sourceCompatibility = "1.17"
}


tasks.withType<Test> {

    useJUnitPlatform()
}
