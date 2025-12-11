package com.example.quoteusingcompose.Screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteusingcompose.DataManager
import com.example.quoteusingcompose.Model.Quote


@Composable
fun QuoteDetail(quote: Quote){

    BackHandler {
        DataManager.switchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ){
        Box(
            // elevation = CardDefaults.cardElevation(0.1.dp),
            modifier = Modifier
                .padding(32.dp)
                .shadow(4.dp, RoundedCornerShape(8.dp), clip = false) // White shadow
                .background(Color.White, shape = RoundedCornerShape(8.dp)) // Card background

        ) {
            Column(
                modifier = Modifier.padding( 16.dp,24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180f)
                )
                Text(text = quote.text,
                    fontFamily = FontFamily.SansSerif,
                    style = MaterialTheme.typography.headlineSmall)

                Spacer(modifier = Modifier.height(16.dp))
                Text(text = quote.author,
                    fontFamily = FontFamily.Serif,
                    style = MaterialTheme.typography.titleLarge)
            }

        }

    }


}