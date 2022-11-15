package com.alhams.declareyourui.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alhams.declareyourui.R

@Composable
fun AlignYourBodyElement(
    @DrawableRes image: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(88.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
        )
    }
}

@Composable
@Preview
fun AlignYourBodyElementPreview() {
    AlignYourBodyElement(
        image = R.drawable.ab1_inversions,
        text = R.string.ab1_inversions
    )
}