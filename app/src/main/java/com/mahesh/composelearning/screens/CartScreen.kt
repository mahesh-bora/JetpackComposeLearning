package com.mahesh.composelearning.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartScreen(navController: NavController){
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
        Column(modifier = Modifier.fillMaxSize().padding(paddingValue). background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Cart")
        }    }
}