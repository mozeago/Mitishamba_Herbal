package com.example.mitishambaherbal.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import com.example.mitishambaherbal.model.Herb

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HerbCard(herb: Herb, cardWidth: Dp, cardHeight: Dp) {
    Card(onClick = { /*TODO*/ }) {
        Column() {
            Text(text = herb.image)
            Text(text = herb.title)
            Text(text = herb.description)
        }
    }
}