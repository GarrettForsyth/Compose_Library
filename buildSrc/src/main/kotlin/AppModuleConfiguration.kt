import com.android.build.gradle.AppExtension

/**
 * Configuration for the application module.
 */
fun AppExtension.configureApplication() {
    defaultConfig.apply {
        applicationId = ProjectConfiguration.applicationId
        versionCode = ProjectConfiguration.versionCode
        versionName = ProjectConfiguration.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    val sharedTestDir = "src/sharedTest/"
    sourceSets {
        getByName("test") {
            java { srcDir(sharedTestDir + "java") }
            resources { srcDir(sharedTestDir + "resources") }
        }

        getByName("androidTest") {
            java { srcDir(sharedTestDir + "java") }
            resources { srcDir(sharedTestDir + "resources") }
        }
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }

    packagingOptions.resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")

}