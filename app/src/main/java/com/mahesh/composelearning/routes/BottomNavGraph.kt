package com.mahesh.composelearning.routes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mahesh.composelearning.screens.CartScreen
import com.mahesh.composelearning.screens.HomeScreen
import com.mahesh.composelearning.screens.ProductScreen
import com.mahesh.composelearning.screens.SettingScreen
import java.lang.reflect.Modifier

@Composable
fun BottomNavGraph (navController: NavHostController, paddingValues: PaddingValues){
    NavHost(navController = navController
        , startDestination = BottomBarScreen.Home.route,
        ){

        composable(route = "home"){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Product.route){
            ProductScreen()
        }
        composable(route = BottomBarScreen.Cart.route){
            CartScreen()
        }
        composable(route = "setting"){
            SettingScreen()
        }

    }
}