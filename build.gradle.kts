// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  apply(from = "mtlink_version.gradle.kts")

  repositories {
    google()
    jcenter()
  }

  dependencies {
    classpath("com.android.tools.build:gradle:4.2.0")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}
