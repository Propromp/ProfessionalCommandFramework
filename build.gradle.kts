plugins {
    kotlin("jvm") version "1.5.0" apply false
    id("com.github.johnrengelman.shadow") version "5.2.0" apply false
}
allprojects {
    apply{
        plugin("org.jetbrains.kotlin.jvm")
        plugin("com.github.johnrengelman.shadow")
        plugin("java")
        plugin("maven-publish")
    }
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://libraries.minecraft.net")
        maven("https://jitpack.io")
    }
    val implementation by configurations
    val compileOnly by configurations
    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        compileOnly("com.destroystokyo.paper", "paper-api", "1.16.5-R0.1-SNAPSHOT")
    }
}