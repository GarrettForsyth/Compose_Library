dependencies {
    implementation(Libraries.Extensions.core)
    implementation(Libraries.Extensions.lifecycle)
    implementation(Libraries.Ui.compose)
    implementation(Libraries.Ui.material)
    implementation(Libraries.Ui.composePreview)
    implementation(Libraries.Ui.composeActivity)

    testImplementation(Libraries.Test.Unit.junit)
    testImplementation(Libraries.Test.Unit.mockk)
    testImplementation(Libraries.Test.Unit.mockkJVM)


    androidTestImplementation(Libraries.Test.Feature.junit)
    androidTestImplementation(Libraries.Test.Feature.espresso)
    androidTestImplementation(Libraries.Test.Feature.composeUi)
    androidTestImplementation(Libraries.Test.Feature.mockkAndroid)
    //androidTestImplementation(Libraries.Test.Feature.mockkAndroidJVM)

    debugImplementation(Libraries.Test.Shared.composeUiTooling)
    debugImplementation(Libraries.Test.Shared.assertK)
}
