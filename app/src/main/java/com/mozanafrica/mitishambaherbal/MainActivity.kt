package com.mozanafrica.mitishambaherbal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mozanafrica.mitishambaherbal.ui.theme.MitishambaHerbalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MitishambaHerbalTheme {
                HerbsList()
            }
        }
    }
}

@Composable
fun HerbCard() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        LazyColumn(state = rememberLazyListState()) {
            items(20) {
                Image(
                    painter = painterResource(id = R.drawable.mitishambaherbal),
                    contentDescription = "Humea sana sana baada ya msimu wa mvua nyingi hasaa sehemu za mwambao wa pwani"
                )
                Text(text = "Mzalia Nyuma", style = MaterialTheme.typography.h4)
                Text(text = "Mzalia Nyuma", style = MaterialTheme.typography.subtitle2)
            }
        }
    }
}

@Composable
fun HerbsList() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        elevation = 10.dp,
        shape = RoundedCornerShape(3.dp)
    ) {
        HerbCard()
    }
}