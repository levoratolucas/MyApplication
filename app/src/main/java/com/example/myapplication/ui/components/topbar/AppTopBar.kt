package com.example.myapplication.ui.components.topbar


import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun AppTopBar(
    navController: NavController,
    tabAtual: String
) {
    TopBar(
        biblioteca = mapOf(
            "home" to { navController.navigate("home") },
            "login" to { navController.navigate("login") },
            "sair" to { navController.navigate("sair") }
        ),
        tabAtual = tabAtual,
        corLetra = Color.White,
        corFundo = Color(0xFF6200EE)
    )
}