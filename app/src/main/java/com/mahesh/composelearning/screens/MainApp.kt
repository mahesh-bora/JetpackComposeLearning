package com.mahesh.composelearning.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mahesh.composelearning.routes.BottomBarScreen
import com.mahesh.composelearning.routes.BottomNavGraph
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp(){
    val navController = rememberNavController();
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Home") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Home Menu Icon")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Search , contentDescription = "Search Here")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Info, contentDescription = "Info")

                    }
                })
        },
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { paddingValue ->
        BottomNavGraph(navController = navController, paddingValues = paddingValue)
    }
}

@Composable
fun BottomBar(navController: NavController){
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Product,
        BottomBarScreen.Cart,
        BottomBarScreen.Settings,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination  = navBackStackEntry?.destination

    NavigationBar {
        screens.forEach{
            screen ->
            NavigationBarItem(
                label = { Text(text = screen.title)},
                icon = {
                          Icon(imageVector = screen.icon, contentDescription = screen.title)
                },
                selected = currentDestination?.hierarchy?.any(){
                                                               it.route == screen.route
                }==true,
                onClick = {
                    navController.navigate(screen.route)
                })
        }
    }
}