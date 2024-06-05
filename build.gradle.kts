import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
  kotlin("jvm") version "2.0.0"
  `maven-publish`
}

repositories {
  mavenCentral()
}
kotlin {
  compilerOptions.jvmTarget.set(JvmTarget.JVM_1_8)
}
configure<JavaPluginExtension> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      groupId = "xyz.reitmaier"
      artifactId = "kinputevents"
      version = "0.1"

      from(components["kotlin"])
    }
  }
}
