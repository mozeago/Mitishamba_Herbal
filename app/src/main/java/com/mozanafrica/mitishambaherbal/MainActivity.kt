package com.mozanafrica.mitishambaherbal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
            .padding(10.dp)
            .wrapContentHeight()
    ) {
        items(items = list, itemContent = { text_changed ->
            Text(
                text = "Title $text_changed",
                fontSize = 24.sp,
                color = MaterialTheme.colors.secondaryVariant
            )
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
            .padding(10.dp)
            .wrapContentHeight()

    ) {
        items(items = list, itemContent = { item ->
            HerbSingleCard()
        })
    }
}

@Preview
@Composable
fun HerbSingleCard() {
    val robotoFontFamily = FontFamily(
        Font(R.font.roboto_bold, FontWeight.Bold)
    )
    val paddingTenDp = Modifier.padding(10.dp)
    Card(elevation = 10.dp, modifier = paddingTenDp.width(300.dp)) {
        Column(modifier = paddingTenDp) {
            Image(
                painter = painterResource(id = R.drawable.mitishambaherbal),
                contentDescription = "Herb name will got here",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "Herb Name Goes here",
                fontFamily =
                FontFamily(
                    Font(R.font.roboto_bold)
                ),
                fontWeight = FontWeight.Bold, style = MaterialTheme.typography.subtitle1,
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "Herb subtitle goes here",
                fontFamily =
                FontFamily(
                    Font(R.font.roboto_bold)
                ),
                style = MaterialTheme.typography.subtitle2,
            )
            Text(
                text = "n publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before the final copy is available.",
                style = MaterialTheme.typography.body1
            )
        }
    }
}