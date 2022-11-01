package com.mozanafrica.mitishambaherbal.navigation

sealed class Screen(val route: String) {
    object OnBoarding : Screen(route = "onboarding")
    object DashBoard : Screen(route = "dashboard")
}
