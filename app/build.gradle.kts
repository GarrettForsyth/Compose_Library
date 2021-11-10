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
    testImplementation(Libraries.Test.Unit.robolectric)
    testImplementation(Libraries.Test.Feature.composeUi)

    androidTestImplementation(Libraries.Test.Feature.espresso)
    androidTestImplementation(Libraries.Test.Feature.mockkAndroid)
    androidTestImplementation(Libraries.Test.Feature.composeUi)
    androidTestImplementation(Libraries.Test.Feature.junit)

    debugImplementation(Libraries.Test.Shared.composeUiTooling)
    debugImplementation(Libraries.Test.Shared.assertK)
    debugImplementation(Libraries.Test.Feature.junit)
}
