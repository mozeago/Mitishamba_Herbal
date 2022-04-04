package com.mozanafrica.mitishambaherbal.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mozanafrica.mitishambaherbal.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    h1 = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                R.font.domine_bold
            )
        ),
    ),
    h2 = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(
            Font(
                R.font.domine_bold
            )
        ),
        color = grey_light
    ),
    /* Other default text styles to override
button = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.W500,
    fontSize = 14.sp
),
caption = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp
)
*/
)