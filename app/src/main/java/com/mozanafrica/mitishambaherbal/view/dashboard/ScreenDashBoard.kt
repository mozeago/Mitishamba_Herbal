package com.mozanafrica.mitishambaherbal.view.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.mozanafrica.mitishambaherbal.component.AppBottomNavigation
import com.mozanafrica.mitishambaherbal.model.DataClassHerbCategory
import com.mozanafrica.mitishambaherbal.model.Herb
import com.mozanafrica.mitishambaherbal.navigation.Screen
import com.mozanafrica.mitishambaherbal.screen.HerbCard
import com.mozanafrica.mitishambaherbal.screen.HerbCardRecentlyAdded
import com.mozanafrica.mitishambaherbal.screen.RowTitle


@Composable
fun DashboardScreenView(navController: NavHostController) {
    RecentlyAddedHeading(navController)

}

@Composable
fun RecentlyAddedHeading(navController: NavHostController) {
    Column() {
        RowTitle(titleStart = "Recently Added", "see all")
        val recently_added_herbs = listOf(
            Herb(
                "Nam placerat risus",
                "Nulla vel justo pellentesque",
                "Cras a augue et magna maximus pharetra maximus fringilla tellus. Morbi ligula velit, mollis vitae ullamcorper non, varius vel magna. In tempus euismod varius. Quisque malesuada, tellus id scelerisque placerat, nulla massa convallis magna, et tincidunt tortor orci ut orci. Sed ante mauris, faucibus in sapien",
                "https://picsum.photos/200/300"
            ), Herb(
                "Maecenas bibendum",
                "Praesent eu interdum mi",
                "Mauris ante urna, pellentesque a facilisis auctor, sollicitudin at purus. Integer ut enim id turpis condimentum eleifend. Sed tortor ipsum, pulvinar luctus hendrerit eu, interdum et nunc. Nunc fermentum imperdiet consequat.",
                "https://picsum.photos/200/300"
            ), Herb(
                "Maecenas bibendum",
                "Praesent eu interdum mi",
                "Mauris ante urna, pellentesque a facilisis auctor, sollicitudin at purus. Integer ut enim id turpis condimentum eleifend. Sed tortor ipsum, pulvinar luctus hendrerit eu, interdum et nunc. Nunc fermentum imperdiet consequat.",
                "https://picsum.photos/200/300"
            )
        )
        val herbs_categories = listOf(
            DataClassHerbCategory("Mgongo"),
            DataClassHerbCategory("Miguu"),
            DataClassHerbCategory("Kichwa"),
            DataClassHerbCategory("Marohani"),
            DataClassHerbCategory("Kisomo Cha Kuvuta"),
            DataClassHerbCategory("Zuia Wezi Na Uchawi"),
            DataClassHerbCategory("Maradhi Sugu"),
            DataClassHerbCategory("Mtu Aliyetupiwa"),
        )
        HerbCardRecentlyAdded(herbs = recently_added_herbs)
        val configuration = LocalConfiguration.current
        val screenWidth = configuration.screenWidthDp.dp
        val screenHeight = configuration.screenHeightDp.dp
        val cardHeight = screenHeight / 2f
        val cardWidth = screenWidth / 2f
        val paddingValueTen = Modifier.padding(10.dp)
        val maximumLinesForCards = 2
        LazyColumn(content = {
            items(herbs_categories) { herbCategory ->
                RowTitle(titleStart = herbCategory.categoryName)
                LazyRow(content = {
                    items(recently_added_herbs) { herb ->
                        HerbCard(
                            herb = herb,
                            cardWidth = cardWidth,
                            cardHeight = cardHeight,
                            Screen.SingleCard.route,
                            navController
                        )
                    }
                })
            }
        })
    }
}


