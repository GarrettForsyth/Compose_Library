object Libraries {
    object Extensions {
        const val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        const val lifecycle =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
    }

    object Ui {
        const val compose = "androidx.compose.ui:ui:${Versions.AndroidX.compose}"
        const val material = "androidx.compose.material:material:${Versions.AndroidX.compose}"
        const val composePreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.AndroidX.compose}"
        const val composeActivity =
            "androidx.activity:activity-compose:${Versions.AndroidX.activity}"
    }

    object Test {
        object Unit {
            const val junit = "junit:junit:${Versions.junit}"
            const val mockk =  "io.mockk:mockk:${Versions.mockk}"
            const val mockkJVM = "io.mockk:mockk-agent-jvm:${Versions.mockk}"

        }

        object Feature {
            const val junit = "androidx.test.ext:junit:${Versions.AndroidX.junit}"
            const val espresso =
                "androidx.test.espresso:espresso-core:${Versions.AndroidX.espresso}"
            const val composeUi = "androidx.compose.ui:ui-test-junit4:${Versions.AndroidX.compose}"
            const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
            const val mockkAndroidJVM = "io.mockk:mockk-agent-jvm:${Versions.mockk}"
        }

        object Shared {
            const val composeUiTooling =
                "androidx.compose.ui:ui-tooling:${Versions.AndroidX.compose}"
            const val assertK = "com.willowtreeapps.assertk:assertk-jvm:${Versions.assertK}"
        }
    }

}
