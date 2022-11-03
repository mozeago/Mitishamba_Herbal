package com.mozanafrica.mitishambaherbal.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.mozanafrica.mitishambaherbal.model.DataClassHerbCategory
import com.mozanafrica.mitishambaherbal.model.Herb

@Composable
fun HerbCategory(herbsCategories: List<DataClassHerbCategory>, herbs: List<Herb>) {
    val navController = rememberNavController()
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp
    val cardHeight = screenHeight / 2f
    val cardWidth = screenWidth / 2f
    val paddingValueTen = Modifier.padding(10.dp)
    val maximumLinesForCards = 2
    LazyColumn(content = {
        items(herbsCategories) { herbCategory ->
            RowTitle(titleStart = herbCategory.categoryName)
            LazyRow(content = {
                items(herbs) { herb ->
                    HerbCard(
                        herb = herb,
                        cardWidth = cardWidth,
                        cardHeight = cardHeight,
                        navController,
                        "singlecard"
                    )
                }
            })
        }
    })
}