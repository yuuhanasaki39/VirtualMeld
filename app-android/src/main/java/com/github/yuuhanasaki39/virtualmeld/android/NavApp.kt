package com.github.yuuhanasaki39.virtualmeld.android

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.yuuhanasaki39.features.avatar.AvatarScreenRoute
import com.github.yuuhanasaki39.features.home.HomeScreenRoute

@Composable
fun NavApp(
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(navController = navController, startDestination = startDestination)
    {
        composable("home") {
            HomeScreenRoute(
                onClick = {
                    navController.navigate("avatar")
                }
            )
        }
        composable("avatar") {
            AvatarScreenRoute(
                onClick = {
                    navController.navigate("home")
                }
            )
        }
    }
}