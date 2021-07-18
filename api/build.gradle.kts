import de.undercouch.gradle.tasks.download.Download

plugins {
    id("org.jetbrains.dokka") version "1.5.0"
}

group = "net.propromp"
version = "2.0"

dependencies {
    compileOnly("com.mojang:brigadier:1.0.17")
}

tasks {
    compileJava {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.javaParameters=true
    }

    javadoc {
        options.encoding = "UTF-8"
    }

    shadowJar {
        archiveFileName.set("pcf-api-v$version.jar")
    }
    dokkaJavadoc {
        outputDirectory.set(File("javadoc"))
        this.dokkaSourceSets.register("src/main")
    }
    dokkaHtml {
        outputDirectory.set(File("dokka"))
    }
}