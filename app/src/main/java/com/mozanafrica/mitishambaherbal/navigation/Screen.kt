package com.mozanafrica.mitishambaherbal.navigation

sealed class Screen(val route: String) {
    object OnBoarding : Screen(route = "onboarding_screen")
    object DashBoard : Screen(route = "dashboard_screen")
    object SingleCard : Screen(route = "single_card_screen")
}
