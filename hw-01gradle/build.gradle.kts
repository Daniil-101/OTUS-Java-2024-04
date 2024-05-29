import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel

plugins {
    id("java")
}

group = "ru.otus"
IdeaLanguageLevel(21)

repositories {
    mavenCentral()
}

dependencies {
    implementation ("com.google.guava:guava:33.1.0-jre")
}
