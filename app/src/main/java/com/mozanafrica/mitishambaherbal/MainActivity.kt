package com.mozanafrica.mitishambaherbal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mozanafrica.mitishambaherbal.ui.theme.MitishambaHerbalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MitishambaHerbalTheme {
                HerbList()
            }
        }
    }
}

@Preview
@Composable
fun PreviewFunctions() {
    HerbList()
}

@Composable
fun HerbList() {
    HerbListLazyColumn()
}

@Composable
fun HerbListLazyColumn() {
    val list = (0..5).map { it.toString() }
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        items(items = list, itemContent = { text_changed ->
            Text(text = "Title $text_changed", fontSize = 50.sp, fontStyle = FontStyle.Italic)
            HerbCardLazyRow()
        })

    }
}

@Composable
fun HerbCardLazyRow() {
    val list = (0..10).map { it.toString() }
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()

    ) {
        items(items = list, itemContent = { item ->
            HerbSingleCard()
        })
    }
}

@Composable
fun HerbSingleCard() {
    val paddingTenDp = Modifier.padding(10.dp)
    Card(elevation = 10.dp, modifier = paddingTenDp.fillMaxWidth()) {
        Column(modifier = paddingTenDp) {
            Image(
                painter = painterResource(id = R.drawable.mitishambaherbal),
                contentDescription = "Herb name will got here",
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "Herb Name Goes here")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "Herb subtitle goes here")
        }
    }
}