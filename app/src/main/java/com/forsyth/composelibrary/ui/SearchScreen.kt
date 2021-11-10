package com.forsyth.composelibrary.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.ImeAction
import com.forsyth.composelibrary.R

@Composable
fun BookSearchField(
    onCompleteSearch: (String) -> Unit
) {
    val (text, setText) = remember { mutableStateOf("") }
    val imeAction = { onCompleteSearch(text) }
    val cdTextInput = stringResource(R.string.cd_text_input)

    InputText(
        modifier = Modifier.semantics { contentDescription = cdTextInput  },
        text = text,
        onTextChange =  setText,
        imeAction = ImeAction.Search,
        onImeAction = imeAction
    )
}

@Composable
fun BookSearchResultList(){
    val cdBookSearchResultList = stringResource(R.string.cd_book_search_result_list)
    Column(
        modifier = Modifier.semantics { contentDescription = cdBookSearchResultList }
    ) {
        Text(text = "crime and punishment")
    }
}
