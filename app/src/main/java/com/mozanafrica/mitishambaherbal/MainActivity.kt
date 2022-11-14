package com.mozanafrica.mitishambaherbal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mozanafrica.mitishambaherbal.data.theme.MitishambaHerbalTheme
import com.mozanafrica.mitishambaherbal.navigation.NavGraphSetup

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    @OptIn(ExperimentalMaterialApi::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MitishambaHerbalTheme {
                navController = rememberNavController()
                NavGraphSetup(navController = navController)

            }
        }
    }
}