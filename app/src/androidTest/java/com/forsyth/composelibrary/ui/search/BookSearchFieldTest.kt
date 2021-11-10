package com.forsyth.composelibrary.ui.search

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performImeAction
import androidx.compose.ui.test.performTextInput
import com.forsyth.composelibrary.EmptyActivity
import com.forsyth.composelibrary.R
import com.forsyth.composelibrary.ui.BookSearchField
import io.mockk.called
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BookSearchFieldTest {

    @get:Rule
    val composeRule = createAndroidComposeRule(EmptyActivity::class.java)

    private val onCompleteSearch: (String) -> Unit = mockk()

    @Before
    fun setup() {
        composeRule.setContent {
            BookSearchField(onCompleteSearch = onCompleteSearch )
        }
        every { onCompleteSearch(any()) } returns Unit
    }

    @Test
    fun it_updates_text_displayed_on_text_input() {
        val textInputContentDescription = composeRule.activity.getString(R.string.cd_text_input)
        val textInput = composeRule.onNodeWithContentDescription(textInputContentDescription)
        val inputString = "test"
        textInput.assertTextEquals("")
        textInput.performTextInput(inputString)
        textInput.assertTextEquals(inputString)
    }

    @Test
    fun onCompleteSearch_is_called_on_ime_enter_test() {
        verify { onCompleteSearch wasNot called }
        val textInputContentDescription = composeRule.activity.getString(R.string.cd_text_input)
        val textInput = composeRule.onNodeWithContentDescription(textInputContentDescription)
        val inputString = "test"
        textInput.performTextInput(inputString)
        textInput.performImeAction()
        verify(exactly = 1) { onCompleteSearch(inputString) }
    }

}