package com.mozanafrica.mitishambaherbal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mozanafrica.mitishambaherbal.presentation.ui.tags.TagNames
import com.mozanafrica.mitishambaherbal.presentation.ui.tags.getAllTags
import com.mozanafrica.mitishambaherbal.ui.theme.MitishambaHerbalTheme
import com.mozanafrica.mitishambaherbal.ui.theme.Shapes
import com.mozanafrica.mitishambaherbal.ui.theme.grey_light

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

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun HerbListLazyColumn() {
    val list = (0..5).map { it.toString() }
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        stickyHeader {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                elevation = 8.dp
            ) {
                Column() {
                    Row() {
                        TextField(value = "Search Here", onValueChange = { searchVslue -> })
                    }
                    ScrollableTabRow(
                        selectedTabIndex = 1,
                        modifier = Modifier
                            .background(MaterialTheme.colors.surface)
                            .fillMaxWidth()
                    ) {
                        for (tag in getAllTags()) {
                            Text(
                                text = tag.value,
                                style = MaterialTheme.typography.body2,
                                modifier = Modifier.padding(8.dp)
                            )
                        }

                    }
                }
            }


        }
        items(items = list, itemContent = { text_changed ->
            for (tag in getAllTags()) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(15.dp, 0.dp, 0.dp, 0.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        text = " ${tag.value}",
                        modifier = Modifier.padding(15.dp),
                        style = MaterialTheme.typography.h1,
                    )
                    Icon(
                        painterResource(id = R.drawable.ic_baseline_arrow_forward_24),
                        contentDescription = "",
                    )
                }
                HerbCardLazyRow()
            }
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
    Card(
        elevation = 8.dp,
        modifier = Modifier
            .padding(15.dp)
            .width(300.dp)
            .clickable { },
        shape = MaterialTheme.shapes.medium,
        backgroundColor = MaterialTheme.colors.surface,


        ) {
        Column(modifier = paddingTenDp) {
            Image(
                painter = painterResource(id = R.drawable.kivumbasi),
                modifier = Modifier
                    .align(CenterHorizontally)
                    .size(100.dp)
                    .clip(CircleShape),
                contentDescription = "Herb name will got here",
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "Herb Name Goes here",
                style = MaterialTheme.typography.h1,
                modifier = Modifier.padding(10.dp, 0.dp, 10.dp, 5.dp)
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "Herb subtitle goes here",
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(10.dp, 0.dp, 10.dp, 5.dp)
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = stringResource(R.string.text_placeholder),
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(10.dp, 0.dp, 10.dp, 5.dp)
            )
        }
    }
}