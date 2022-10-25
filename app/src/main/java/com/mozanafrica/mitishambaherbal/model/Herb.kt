package com.example.mitishambaherbal.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Herb(
    val title: String,
    val subtitle: String,
    val description: String,
    val image: String,
) : Parcelable
