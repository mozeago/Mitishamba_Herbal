@file:OptIn(ExperimentalMaterialApi::class)

package com.mozanafrica.mitishambaherbal.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBarSearch(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface
        ),
        placeholder = {
            Text(text = "Search")
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}

@Composable
fun TopAppBarChip() {
    Chip(onClick = { /*TODO*/ }) {
        Text(text = "Kuvuta baraka")
    }
    Chip(onClick = { /*TODO*/ }) {
        Text(text = "Kukinga mji")
    }
    Chip(onClick = { /*TODO*/ }) {
        Text(text = "Kuondoa Hasad")
    }
}

@Composable
@Preview(showBackground = true)
fun SearchBarPreview() {
    TopAppBarSearch()
    TopAppBarChip()
}