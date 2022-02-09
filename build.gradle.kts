import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
  kotlin("jvm") version "1.6.10"
  `maven-publish`
}

group = "xyz.reitmaier.kinputevents"
version = "0.1"

repositories {
  mavenCentral()
}

//dependencies {
//    implementation(kotlin("stdlib-jdk8"))
//}

configure<JavaPluginExtension> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
