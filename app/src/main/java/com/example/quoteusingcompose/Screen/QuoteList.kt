package com.example.quoteusingcompose.Screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quoteusingcompose.Model.Quote

@Composable
fun QuoteList(data : Array<Quote> , onclick : (quote : Quote)->Unit){
    LazyColumn( content = {
        items(data){
            QuoteListItem(quote = it,onclick)
        }
    })
}