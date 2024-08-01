package com.mahesh.composelearning.routes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.mahesh.composelearning.auth.LoginScreen
import com.mahesh.composelearning.auth.RegisterScreen
import com.mahesh.composelearning.product.ProductDetailScreen
import com.mahesh.composelearning.screens.CartScreen
import com.mahesh.composelearning.screens.HomeScreen
import com.mahesh.composelearning.product.ProductScreen
import com.mahesh.composelearning.screens.SettingScreen
import com.mahesh.composelearning.viewmodel.SettingViewModel

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(
        startDestination = "login",
        route = "auth"
    ){
        composable(route =  "login"){
            LoginScreen(navController)
        }
        composable(route =  "register"){
            RegisterScreen(navController)
        }
    }
}

fun NavGraphBuilder.mainGraph(navController: NavController){
    navigation(
        startDestination = BottomBarScreen.Home.route,
        route = "main"
    ){
        //        composable(route = "home"){
        composable(route =  BottomBarScreen.Home.route){
            HomeScreen(navController)
        }

        composable(route = BottomBarScreen.Product.route){
            ProductScreen(navController)
        }
        composable(route = BottomBarScreen.Cart.route){
            CartScreen(navController)
        }
        composable(route =  BottomBarScreen.Settings.route){
//            val viewModel = SettingViewModel()
            val viewModel = viewModel<SettingViewModel>()
            SettingScreen(navController, viewModel)
        }
    }

}
@Composable
fun BottomNavGraph (navController: NavHostController, paddingValues: PaddingValues){
    NavHost(navController = navController
        , startDestination = "auth",
        ){

        authGraph(navController)
        mainGraph(navController)
        composable(route = "product_detail/{productId}",
            arguments = listOf(navArgument("productId"){type = NavType.IntType})
        ){
            ProductDetailScreen(navController, productId = it.arguments?.getInt("productId") ?:1)
        }
    }
}