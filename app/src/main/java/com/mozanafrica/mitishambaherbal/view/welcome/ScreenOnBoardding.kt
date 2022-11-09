package com.mozanafrica.mitishambaherbal.view.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mozanafrica.mitishambaherbal.navigation.Screen

@Composable
fun OnBoardingScreenView(navController: NavHostController) {
//    Image(
//        painter = painterResource(id = R.drawable.mitishamba_herb_variety),
//        contentDescription = "Mitishamba shop with Herbs",
//        contentScale = ContentScale.Crop,
//        modifier = Modifier
////            .clickable {
////                navController.navigate(Screen.DashBoard.route)
////            }
//            .fillMaxSize()
//    )
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        TotalHerbs(totalCount = 250)
        TambuaFaidaYaMitishamba(navController)
    }
}

@Composable
fun TotalHerbs(totalCount: Int) {
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color.Black)
            .wrapContentSize()
            .padding(10.dp)
    ) {
        Text(text = "$totalCount + Herbs In our Database", color = Color.White)
    }
}

@Composable
fun TambuaFaidaYaMitishamba(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 200.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Column {
            Row {
                Text(text = "Zitambue", color = Color.White, style = MaterialTheme.typography.h3)
                Text(text = "Faida", color = Color.Green, style = MaterialTheme.typography.h2)
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "Za", color = Color.White, style = MaterialTheme.typography.h4)
            Text(text = "Mitishamba", color = Color.White, style = MaterialTheme.typography.h2)
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Skip",
                    color = Color.Black,
                    style = MaterialTheme.typography.body1,
                    fontSize = 20.sp,
                    modifier = Modifier.clickable {
                        navController.navigate(Screen.DashBoard.route)
                    })
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Next",
//                        modifier = Modifier.clickable {
//                            navController.navigate(Screen.SingleCard.route)
//                        }
                    )

                }
            }
        }
    }
}