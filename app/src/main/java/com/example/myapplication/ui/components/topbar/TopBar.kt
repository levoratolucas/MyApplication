package com.example.myapplication.ui.components.topbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Tab
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(
    biblioteca: Map<String, () -> Unit>,  // nome da tab -> ação de navegação
    tabAtual: String,                      // tab selecionada no momento
    corLetra: Color,
    corFundo: Color
) {
    val nomesTabs = biblioteca.keys.toList()
    val tabSelecionada = nomesTabs.indexOf(tabAtual).takeIf { it >= 0 } ?: 0

    PrimaryTabRow(
        selectedTabIndex = tabSelecionada,
        containerColor = corFundo,
        modifier = Modifier.fillMaxWidth().statusBarsPadding()
    ) {
        nomesTabs.forEachIndexed { index, nome ->
            Tab(
                selected = tabSelecionada == index,
                onClick = { biblioteca[nome]?.invoke() },
                text = {
                    Text(
                        text = nome,
                        color = corLetra,
                        fontSize = 16.sp
                    )
                }
            )
        }
    }
}