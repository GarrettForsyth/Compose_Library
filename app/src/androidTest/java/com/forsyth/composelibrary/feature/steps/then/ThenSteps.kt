package com.forsyth.composelibrary.feature.steps.then

import androidx.compose.ui.test.hasText
import haveChildWithStateThat

fun containText(text: String) = haveChildWithStateThat(hasText(text))
