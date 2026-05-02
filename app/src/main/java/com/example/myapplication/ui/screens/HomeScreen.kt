package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.ui.components.footer.AppFooter
import com.example.myapplication.ui.components.topbar.AppTopBar
import com.example.myapplication.viewmodel.PessoaViewModel

@Composable
fun HomeScreen(navController: NavController) {

    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route ?: "home"

    Scaffold(
        topBar = {
            AppTopBar(navController, currentRoute)
        },
        bottomBar = {AppFooter("Lucas")}
    ) { innerPadding ->

        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            val viewModel: PessoaViewModel = viewModel()
            val pessoa by viewModel.pessoa.collectAsState()

            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "🏠 Tela HOME")
                Text(text = "Bem vindo, ${pessoa.nome}!")
                Text(text = "Idade: ${pessoa.idade}")
                Text(text = "Cor favorita: ${pessoa.cor}")
                Text(text = "Sexo: ${pessoa.sexo}")
            }
        }

    }
}