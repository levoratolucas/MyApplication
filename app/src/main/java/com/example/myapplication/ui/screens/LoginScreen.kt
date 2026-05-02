package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.ui.components.footer.AppFooter
import com.example.myapplication.ui.components.topbar.AppTopBar

@Composable
fun LoginScreen(navController: NavController) {

    Scaffold(
        topBar = {
            val currentRoute = "login"
            AppTopBar(navController, currentRoute)
        },
        bottomBar = {AppFooter("Lucas")}
    ) { innerPadding ->

        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text("Login")
        }

    }
}