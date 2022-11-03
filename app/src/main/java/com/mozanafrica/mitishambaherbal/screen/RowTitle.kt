package com.mozanafrica.mitishambaherbal.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mozanafrica.mitishambaherbal.R

@Composable
fun RowTitle(titleStart: String, titleEnd: String = "") {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(
            titleStart, style = TextStyle(
                fontSize = 20.sp, fontWeight = FontWeight.Medium
            )
        )
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_arrow_forward_24),
            contentDescription =""
        )
    }
}