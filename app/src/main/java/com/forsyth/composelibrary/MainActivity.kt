package com.forsyth.composelibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.forsyth.composelibrary.ui.BookSearchField
import com.forsyth.composelibrary.ui.BookSearchResultList
import com.forsyth.composelibrary.ui.theme.ComposeLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLibraryTheme {
                SearchScreen()
            }
        }
    }
}

@Composable
fun SearchScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        BookSearchField(onCompleteSearch = {})
        BookSearchResultList()
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLibraryTheme {
        SearchScreen()
    }
}