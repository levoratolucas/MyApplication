package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myapplication.model.Pessoa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PessoaViewModel : ViewModel() {

    // Dados simulando um objeto
    private val _pessoa = MutableStateFlow(
        Pessoa(
            nome = "LUCAS",
            idade = 25,
            cor = "Azul",
            sexo = "Masculino"
        )
    )

    val pessoa: StateFlow<Pessoa> = _pessoa.asStateFlow()
}