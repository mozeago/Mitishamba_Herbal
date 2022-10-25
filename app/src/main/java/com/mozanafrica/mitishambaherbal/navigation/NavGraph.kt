package com.example.mitishambaherbal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mitishambaherbal.view.dashboard.DashboardScreenView
import com.example.mitishambaherbal.view.welcome.OnBoardingScreenView

@Composable
fun NavGraphSetup(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.OnBoarding.route) {
        composable(route = Screen.OnBoarding.route) {
            OnBoardingScreenView(navController)
        }
        composable(route = Screen.DashBoard.route) {
            DashboardScreenView(navController)
        }
    }
}