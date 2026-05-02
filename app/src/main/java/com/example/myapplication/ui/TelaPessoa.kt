package com.example.myapplication.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.viewmodel.PessoaViewModel

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun TelaPessoa(
    modifier: Modifier = Modifier
) {
    // Criar a ViewModel aqui (sem colocar no parâmetro)
    val viewModel = PessoaViewModel()
    val pessoa by viewModel.pessoa.collectAsState()

    // View exibindo os dados
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "📝 Nome: ${pessoa.nome}")
        Text(text = "🎂 Idade: ${pessoa.idade}")
        Text(text = "🎨 Cor favorita: ${pessoa.cor}")
        Text(text = "⚧ Sexo: ${pessoa.sexo}")
    }
}