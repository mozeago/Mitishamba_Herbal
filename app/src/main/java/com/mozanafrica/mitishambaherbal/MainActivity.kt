package com.mozanafrica.mitishambaherbal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mozanafrica.mitishambaherbal.component.AppBottomNavigation
import com.mozanafrica.mitishambaherbal.data.theme.MitishambaHerbalTheme
import com.mozanafrica.mitishambaherbal.navigation.NavGraphSetup

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MitishambaHerbalTheme {
                navController = rememberNavController()
                Scaffold(
                    bottomBar = { AppBottomNavigation(navHostController = navController) }
                ) {
                    NavGraphSetup(navController = navController)
                }

            }
        }
    }
}