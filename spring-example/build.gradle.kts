plugins {
    id("java")
}

group = "org.springframework"
version = "5.2.26.BUILD-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
	optional(project(":spring-context"))
}

tasks.test {
    useJUnitPlatform()
}