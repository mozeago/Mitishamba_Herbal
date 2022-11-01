package com.mozanafrica.mitishambaherbal.view.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mozanafrica.mitishambaherbal.model.Herb
import com.mozanafrica.mitishambaherbal.screen.HerbCardRecentlyAdded


@Composable
fun DashboardScreenView(navController: NavHostController) {
    RecentlyAddedHeading()
}

@Composable
fun RecentlyAddedHeading() {
    Column() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                "Recently Added", style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Medium
                )
            )
            Text("See All", style = MaterialTheme.typography.caption)
        }
        val recently_added_herbs = listOf(
            Herb(
                "Nam placerat risus",
                "Nulla vel justo pellentesque",
                "Cras a augue et magna maximus pharetra maximus fringilla tellus. Morbi ligula velit, mollis vitae ullamcorper non, varius vel magna. In tempus euismod varius. Quisque malesuada, tellus id scelerisque placerat, nulla massa convallis magna, et tincidunt tortor orci ut orci. Sed ante mauris, faucibus in sapien",
                "https://picsum.photos/200"
            ), Herb(
                "Maecenas bibendum",
                "Praesent eu interdum mi",
                "Mauris ante urna, pellentesque a facilisis auctor, sollicitudin at purus. Integer ut enim id turpis condimentum eleifend. Sed tortor ipsum, pulvinar luctus hendrerit eu, interdum et nunc. Nunc fermentum imperdiet consequat.",
                "https://picsum.photos/200"
            ), Herb(
                "Maecenas bibendum",
                "Praesent eu interdum mi",
                "Mauris ante urna, pellentesque a facilisis auctor, sollicitudin at purus. Integer ut enim id turpis condimentum eleifend. Sed tortor ipsum, pulvinar luctus hendrerit eu, interdum et nunc. Nunc fermentum imperdiet consequat.",
                "https://picsum.photos/200"
            )
        )
        HerbCardRecentlyAdded(herbs = recently_added_herbs)
    }
}


