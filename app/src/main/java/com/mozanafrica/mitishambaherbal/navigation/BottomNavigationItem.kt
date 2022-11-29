package com.mozanafrica.mitishambaherbal.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mozanafrica.mitishambaherbal.R

sealed class BottomNavigationItem(
    @StringRes val title: Int, @DrawableRes val icon: Int, val navRoute: String
) {
    object Home :
        BottomNavigationItem(R.string.home, R.drawable.ic_home_24, Screen.DashBoard.route)

    object Search :
        BottomNavigationItem(R.string.search, R.drawable.ic_search_24, Screen.SingleCard.route)

    object Favorite : BottomNavigationItem(
        R.string.favorites, R.drawable.ic_star_outline_24, Screen.OnBoarding.route
    )
}