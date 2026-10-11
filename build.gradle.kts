plugins {
    id("java")
}

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("io.github.jbock-java:jbock:6.0")
    annotationProcessor("io.github.jbock-java:jbock-compiler:6.0.1")
    testImplementation(platform("org.junit:junit-bom:6.1.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "net.jbock.cp.CopyFile"
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.register("copyDependencies", Copy::class) {
    from(configurations.compileClasspath)
    into("${rootDir}/dependencies")
}

tasks.named("build") {
    dependsOn(":copyDependencies")
}

tasks.named<Delete>("clean") {
    delete.add("${rootDir}/dependencies")
}
