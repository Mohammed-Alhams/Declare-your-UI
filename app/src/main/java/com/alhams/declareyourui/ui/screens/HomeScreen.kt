package com.alhams.declareyourui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alhams.declareyourui.R
import com.alhams.declareyourui.ui.components.AlignYourBodyRow
import com.alhams.declareyourui.ui.components.FavouriteCollectionGrid
import com.alhams.declareyourui.ui.components.HomeSection
import com.alhams.declareyourui.ui.components.SearchBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .padding(vertical = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite_collections) {
            FavouriteCollectionGrid()
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xEEE9D9D6)
fun HomeScreenPreview() {
    HomeScreen()
}