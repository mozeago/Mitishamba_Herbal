package com.mozanafrica.mitishambaherbal.screen

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.mozanafrica.mitishambaherbal.model.Herb

@Composable
fun HerbCardRecentlyAdded(herbs: List<Herb>) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp
    val cardHeight = screenHeight / 2f
    val cardWidth = screenWidth / 2f
    LazyRow() {
        items(herbs) { herb ->
            HerbCard(herb = herb, cardWidth = cardWidth, cardHeight = cardHeight)
        }
    }
}