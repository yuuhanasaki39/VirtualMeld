package com.github.yuuhanasaki39.features.avatar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.unity3d.player.UnityPlayer

@Composable
fun AvatarScreenRoute(onClick: () -> Unit) {

    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Text("AvatarScreenRoute")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = onClick) {
            Text("toHome")
        }
        UnityView()
    }
}

@Composable
private fun UnityView() {
    AndroidView(
        modifier = Modifier,
        factory = { context ->
            val unityPlayer = UnityPlayer(context)
            unityPlayer.windowFocusChanged(false)
            unityPlayer.resume()
            unityPlayer.windowFocusChanged(true)

            unityPlayer.view
        }
    )
}