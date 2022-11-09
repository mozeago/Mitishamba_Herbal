package com.mozanafrica.mitishambaherbal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mozanafrica.mitishambaherbal.view.dashboard.DashboardScreenView
import com.mozanafrica.mitishambaherbal.view.singlecard.ComposableSingleCardView
import com.mozanafrica.mitishambaherbal.view.welcome.OnBoardingScreenView

@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.OnBoarding.route) {
        composable(route = Screen.OnBoarding.route) {
            OnBoardingScreenView(navController)
        }
        composable(route = Screen.DashBoard.route) {
            DashboardScreenView(navController)
        }
        composable(route = Screen.SingleCard.route) {
            ComposableSingleCardView(navController)
        }
    }
}