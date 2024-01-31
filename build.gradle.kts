// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("com.github.spotbugs") version "5.2.3" apply false
}

allprojects {
    tasks.withType<JavaCompile> {
        options.compilerArgs.add("-Xlint:deprecation")
    }
}
