package com.forsyth.composelibrary.feature

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.forsyth.composelibrary.MainActivity
import com.forsyth.composelibrary.R
import com.forsyth.composelibrary.feature.steps.then.containText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Feature: search for a book
 *
 * As a reader
 * I want to learn more information about a book
 * To decide if I wan to read it
 */
@RunWith(AndroidJUnit4::class)
class SearchForBookFeatureTest {

    @get:Rule
    val composeRule = createAndroidComposeRule(MainActivity::class.java)

    // Scenario: a user searches for the book 'Crime and Punishment'
    @Test
    fun search_for_crime_and_punishment_feature_test() {
        val searchPhrase = "crime and punishment"

        val searchFieldContentDescription = composeRule
            .activity
            .resources
            .getString(R.string.cd_text_input)

        val resultListContentDescription = composeRule
            .activity
            .resources
            .getString(R.string.cd_book_search_result_list)

        val searchField = composeRule.onNodeWithContentDescription(searchFieldContentDescription)
        val resultList = composeRule.onNodeWithContentDescription(resultListContentDescription)

        given { // The app has just launched
        }.on {
            searchField.performTextInput(searchPhrase)
        }.check(resultList) {
            it should containText(searchPhrase)
        }
    }
}