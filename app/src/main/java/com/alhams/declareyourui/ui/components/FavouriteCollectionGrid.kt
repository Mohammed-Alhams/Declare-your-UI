package com.alhams.declareyourui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alhams.declareyourui.data.favoriteCollectionsData

@Composable
fun FavouriteCollectionGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
            .height(120.dp)
    ) {
        items(favoriteCollectionsData) { item ->
            FavouriteCollectionCard(
                text = item.text,
                image = item.drawable
            )
        }
    }
}

@Composable
@Preview
fun FavouriteCollectionGridPreview() {
    FavouriteCollectionGrid()
}