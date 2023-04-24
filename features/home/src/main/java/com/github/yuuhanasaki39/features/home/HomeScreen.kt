package com.github.yuuhanasaki39.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreenRoute(onClick: () -> Unit) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Text("HomeScreenRoute")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = onClick) {
            Text("toAvatar")
        }
    }
}