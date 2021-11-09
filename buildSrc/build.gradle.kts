plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("MyPlugins") {
            id = "my-configuration-plugin"
            implementationClass = "MyConfigurationPlugin"
        }
    }
}

// TODO: Keep these dependencies updated with latest version.
dependencies {
    implementation("com.android.tools.build:gradle:7.1.0-beta02")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
}
