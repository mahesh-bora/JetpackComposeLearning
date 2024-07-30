package com.mahesh.composelearning.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Filled.Home // Replace with your actual icon
    )

    object Product : BottomBarScreen(
        route = "product",
        title = "Product",
        icon = Icons.Filled.Place // Replace with your actual icon
    )

    object Cart : BottomBarScreen(
        route = "cart",
        title = "Cart",
        icon = Icons.Filled.ShoppingCart // Replace with your actual icon
    )

    object Settings : BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Filled.Settings // Replace with your actual icon
    )
}
