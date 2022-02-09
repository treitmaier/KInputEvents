import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
    kotlin("jvm") version "1.6.10"
}

group = "xyz.reitmaier.kinputevents"
version = "0.1"

repositories {
    mavenCentral()
}

//dependencies {
//    implementation(kotlin("stdlib-jdk8"))
//}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
