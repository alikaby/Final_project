plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    jcenter()

}


dependencies {
   testImplementation ("kg.apc:jmeter-plugins-webdriver:4.8.1")
    testImplementation ("kg.apc:jmeter-plugins-tst:2.5")
    testImplementation ("com.dev9:junit-webdriver:1.6")
    testImplementation ("org.seleniumhq.webdriver:webdriver-chrome:0.9.7376")
    testImplementation ("io.github.bonigarcia:webdrivermanager:5.3.2")
    testImplementation ("io.cucumber:cucumber-java:7.12.0")
    testImplementation ("io.cucumber:cucumber-junit:7.12.0")


    repositories {
        mavenCentral()
        google()
        jcenter()
    }

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-params:5.9.2")
    testRuntimeOnly("org.junit.platform:junit-platform-suite:1.9.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}