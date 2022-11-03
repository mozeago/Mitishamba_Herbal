package com.mozanafrica.mitishambaherbal.view.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mozanafrica.mitishambaherbal.model.DataClassHerbCategory
import com.mozanafrica.mitishambaherbal.model.Herb
import com.mozanafrica.mitishambaherbal.screen.HerbCardRecentlyAdded
import com.mozanafrica.mitishambaherbal.screen.HerbCategory
import com.mozanafrica.mitishambaherbal.screen.RowTitle


@Composable
fun DashboardScreenView(navController: NavHostController) {
    RecentlyAddedHeading()
}

@Composable
fun RecentlyAddedHeading() {
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
        HerbCategory(herbsCategories = herbs_categories, recently_added_herbs)
    }
}


