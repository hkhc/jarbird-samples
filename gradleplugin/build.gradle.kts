plugins {
    id("java")
    `kotlin-dsl`
    id("io.hkhc.jarbird") version "0.5.2"
}

repositories {
    mavenCentral()
}

jarbird {
    pub {
        mavenLocal()
        gradlePortal()
        useGpg = true
    }
}

dependencies {
    implementation(gradleApi())
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
