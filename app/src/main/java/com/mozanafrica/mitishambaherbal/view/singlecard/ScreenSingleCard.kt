package com.mozanafrica.mitishambaherbal.view.singlecard

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.mozanafrica.mitishambaherbal.model.Herb
import com.mozanafrica.mitishambaherbal.navigation.Screen
import com.mozanafrica.mitishambaherbal.screen.HerbCard

@Composable
fun ComposableSingleCardView(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp
    val cardHeight = screenHeight / 2f
    val cardWidth = screenWidth / 2f
    val _herb = Herb(
        "Nam placerat risus",
        "Nulla vel justo pellentesque",
        "Cras a augue et magna maximus pharetra maximus fringilla tellus. Morbi ligula velit, mollis vitae ullamcorper non, varius vel magna. In tempus euismod varius. Quisque malesuada, tellus id scelerisque placerat, nulla massa convallis magna, et tincidunt tortor orci ut orci. Sed ante mauris, faucibus in sapien",
        "https://picsum.photos/200/300"
    )
    HerbCard(
        herb = _herb,
        cardWidth = cardWidth,
        cardHeight = cardHeight,
        Screen.SingleCard.route,
        navController
    )
}