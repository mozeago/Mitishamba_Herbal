package com.mozanafrica.mitishambaherbal.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mozanafrica.mitishambaherbal.R
import com.mozanafrica.mitishambaherbal.navigation.BottomNavigationItem

@Composable
fun AppBottomNavigation(navHostController: NavHostController) {
    val bottomNavItems = listOf(
        BottomNavigationItem.Home, BottomNavigationItem.Search, BottomNavigationItem.Favorite
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.black)
    ) {
        val navBackStackEntry by navHostController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        bottomNavItems.forEach { bottomNavItem ->
            BottomNavigationItem(icon = {
                Icon(
                    painter = painterResource(id = bottomNavItem.icon), contentDescription = ""
                )
            },
                label = { Text(text = stringResource(id = bottomNavItem.title)) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                selected = currentRoute == bottomNavItem.navRoute,
                onClick = {
                    navHostController.navigate(bottomNavItem.navRoute)
                })
        }
    }
}

@Preview
@Composable
fun BottomNavPreview() {
    val navHostController: NavHostController = rememberNavController()
    AppBottomNavigation(navHostController = navHostController)
}