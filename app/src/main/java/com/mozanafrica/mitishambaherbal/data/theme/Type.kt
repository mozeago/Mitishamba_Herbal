package com.mozanafrica.mitishambaherbal.data.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mozanafrica.mitishambaherbal.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
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
val title_open_sans = FontFamily(
    Font(R.font.title_opensans_bold, FontWeight.Bold)
)
val subtitle_lato_light_italic = FontFamily(
    Font(R.font.subtitle_lato_italic, FontWeight.Normal)
)
val body_pt_sans_reqular = FontFamily(
    Font(R.font.body_text_pt_sans_regular, FontWeight.Normal)
)
