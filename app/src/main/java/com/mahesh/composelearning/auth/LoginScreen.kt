package com.mahesh.composelearning.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.mahesh.composelearning.routes.BottomNavGraph
import com.mahesh.composelearning.screens.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "LogIn",
                    style = MaterialTheme.typography.titleLarge) },

                )
        },
    ) { paddingValue ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValue),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Login")
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedButton(onClick = {
                navController.navigate(route = "main"){
                    popUpTo("auth"){
                        inclusive = true
                    }
                }}) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedButton(onClick = { navController.navigate(route = "register")}) {
                Text(text = "Register")
            }
        }    }

}