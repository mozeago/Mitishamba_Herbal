package com.mozanafrica.mitishambaherbal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mozanafrica.mitishambaherbal.ui.theme.MitishambaHerbalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MitishambaHerbalTheme {
                HerbList()
            }
        }
    }
}

@Composable
fun HerbList() {
    val paddingTenDp = Modifier.padding(10.dp)
    Card(elevation = 10.dp, modifier = paddingTenDp.fillMaxWidth()) {
        Column(modifier = paddingTenDp) {
            Image(
                painter = painterResource(id = R.drawable.mitishambaherbal),
                contentDescription = "Herb name will got here",
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "Herb Name Goes here")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "Herb subtitle goes here")
        }
    }
}