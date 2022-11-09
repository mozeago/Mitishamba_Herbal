package com.mozanafrica.mitishambaherbal.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.mozanafrica.mitishambaherbal.model.Herb

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HerbCard(
    herb: Herb,
    cardWidth: Dp,
    cardHeight: Dp,
    destinationRoute: String? = null,
    navController: NavHostController
) {
    val context = LocalContext.current
    val paddingValueTen = Modifier.padding(10.dp)
    val maximumLinesForCards = 2
    Card(
        onClick = {
            if (destinationRoute != null) {
                if (navController != null) {
                    Toast.makeText(context, "Navcontroller not empty", Toast.LENGTH_LONG).show()
                    navController.navigate(destinationRoute)
                }
            }

        }, elevation = 10.dp, modifier = paddingValueTen.width(cardWidth)
    ) {
        Column {
            AsyncImage(model = herb.image, contentDescription = "herb image")
            Text(text = herb.title, paddingValueTen)
            Text(text = herb.description, paddingValueTen, maxLines = maximumLinesForCards)
        }
    }
}