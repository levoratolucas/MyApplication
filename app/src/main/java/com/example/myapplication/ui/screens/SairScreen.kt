package com.example.myapplication.ui.screens


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.ui.components.footer.AppFooter
import com.example.myapplication.ui.components.topbar.AppTopBar

@Composable
fun SairScreen(navController: NavController) {

    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route ?: "sair"

    Scaffold(
        topBar = {
            AppTopBar(navController, currentRoute)
        },
        bottomBar = {AppFooter("Lucas")}
    ) { innerPadding ->

        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text("Sair")
        }

    }
}