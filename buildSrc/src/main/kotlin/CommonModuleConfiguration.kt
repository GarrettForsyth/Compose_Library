import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

/**
 * Configuration common between
 *      AppExtension
 *      LibraryExtension
 *      TestExtension
 *      FeatureExtension
 */
fun BaseExtension.configureCommon() {
    setCompileSdkVersion(ProjectConfiguration.compiledSdkVersion)

    defaultConfig.apply {
        minSdk = ProjectConfiguration.minSdkVersion
        targetSdk = ProjectConfiguration.targetSdkVersion
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
        vectorDrawables.useSupportLibrary = true
    }

    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = Versions.AndroidX.compose

    compileOptions.apply {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}
