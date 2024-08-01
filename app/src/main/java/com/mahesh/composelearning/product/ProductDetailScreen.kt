package com.mahesh.composelearning.product

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.mahesh.composelearning.screens.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen(navController: NavController, productId : Int){
    val canNavigateBack = navController.previousBackStackEntry != null

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Product Detail") },
                navigationIcon = {
                    if(canNavigateBack){
                        IconButton(onClick = { navController.navigateUp()}) {
                            Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = "back")
                        }
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
    ) { paddingValue ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValue),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Product Detail")

            Text(text = "Product ID: $productId")
        }    }
}