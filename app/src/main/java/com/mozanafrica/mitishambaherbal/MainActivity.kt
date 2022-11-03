package com.mozanafrica.mitishambaherbal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mozanafrica.mitishambaherbal.navigation.NavGraphSetup
import com.mozanafrica.mitishambaherbal.data.theme.MitishambaHerbalTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
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