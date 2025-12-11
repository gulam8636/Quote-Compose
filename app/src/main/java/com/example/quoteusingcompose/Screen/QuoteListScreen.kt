package com.example.quoteusingcompose.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quoteusingcompose.Model.Quote


@Composable
fun QuoteListScreen(data : Array<Quote>, onclick : (quote : Quote)->Unit){

    Column(

    ) {
        Text(
            text = "Quote App",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp,32.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.titleLarge
        )

        QuoteList(data = data, onclick)
    }



}