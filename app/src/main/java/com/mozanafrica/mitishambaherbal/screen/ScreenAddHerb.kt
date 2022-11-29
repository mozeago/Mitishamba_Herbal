package com.mozanafrica.mitishambaherbal.screen

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.mozanafrica.mitishambaherbal.R

@Composable
fun ScreenAddHerb(navHostController: NavHostController) {
    Button(onClick = { /*TODO*/ }) {
        var herbTitle by remember {
            mutableStateOf("")
        }
        var herbSubtitle by remember {
            mutableStateOf("")
        }
        var herbHowToUse by remember {
            mutableStateOf("")
        }
        AsyncImage(
            model = painterResource(id = R.drawable.ic_camera_24),
            contentDescription = "upload herb photo"
        )
        TextField(value = herbTitle, onValueChange = {
            herbTitle = it
        }, label = {
            Text(text = "Herb Title")
        })
        TextField(value = herbSubtitle, onValueChange = {
            herbSubtitle = it
        }, label = {
            Text(text = "Herb Sub-Title")
        })
        TextField(value = herbHowToUse, onValueChange = {
            herbHowToUse = it
        }, label = {
            Text(text = "How to use the Herb")
        })
    }

}

@Composable
@Preview(showBackground = true)
fun ScreenAddHerbPreview() {
    val navController = rememberNavController()
    ScreenAddHerb(navHostController = navController)
}