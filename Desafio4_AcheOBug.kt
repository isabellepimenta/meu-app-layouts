package com.unasp.meuapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LinhaTotalCorrecao1(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Text("Total")
        Spacer(modifier = Modifier.weight(1f))
        Text("R$ 42,90")
    }
}

@Composable
fun LinhaTotalCorrecao2(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Total")
        Text("R$ 42,90")
    }
}

@Preview(showBackground = true)
@Composable
private fun LinhaTotalCorrecao1Preview() {
    LinhaTotalCorrecao1()
}

@Preview(showBackground = true)
@Composable
private fun LinhaTotalCorrecao2Preview() {
    LinhaTotalCorrecao2()
}
