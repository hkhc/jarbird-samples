plugins {
    id("java")
    `kotlin-dsl`
    id("io.hkhc.jarbird") version "0.7.0"
}

repositories {
    mavenCentral()
}

jarbird {
    pub {
        mavenRepo("demo")
    }
}

dependencies {
    testImplementation("orgcd .junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
