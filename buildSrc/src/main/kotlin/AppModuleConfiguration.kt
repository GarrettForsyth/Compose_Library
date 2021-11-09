import com.android.build.gradle.AppExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByName

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

    packagingOptions.resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")

}