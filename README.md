# Desafios — Column, Row e Box (Aula 04)

Repositório com a resolução dos 4 desafios propostos na Aula 04 de Programação Mobile (ADS · UNASP-SP), sobre os organizadores de layout `Column`, `Row` e `Box` em Jetpack Compose.

Os arquivos estão em:
`app/src/main/java/com/unasp/meuapp/`

## Desafio 1 — Placar do jogo
**Arquivo:** `Desafio1_Placar.kt`

Monta o layout:
```
PLACAR DO JOGO
Casa   2 × 1   Visitante
```

- Um `Column` segura o título em cima e o placar embaixo.
- Um `Row` dentro do `Column` segura os três textos lado a lado.
- `horizontalAlignment = Alignment.CenterHorizontally` centraliza tudo na horizontal.
- Bônus: `verticalArrangement = Arrangement.Center` + `fillMaxSize()` centraliza o conjunto inteiro na tela.

## Desafio 2 — Linha de chat
**Arquivo:** `Desafio2_LinhaChat.kt`

Replica uma linha de conversa (avatar + nome + mensagem + hora), no estilo de apps de mensagem.

- `Row` com `verticalAlignment = Alignment.Top` (diferente do Cartão de Contato visto em aula, que usa `CenterVertically` — por isso a hora fica colada no topo, não no meio).
- Avatar: `Box` com `clip(CircleShape)`.
- Nome e mensagem: `Column(Modifier.weight(1f))`, ocupando o espaço que sobra.
- Hora: `Text` simples, empurrado para a direita pelo `weight` da coluna anterior.

## Desafio 3 — Card de produto
**Arquivo:** `Desafio3_CardProduto.kt`

Monta um card de produto com imagem, nome, preço e botão de compra.

- `Column` externa: `clip(RoundedCornerShape(12.dp))` **antes** do `background` — a ordem da corrente de modifiers importa (recorta primeiro, pinta depois).
- "Imagem": um `Box` cinza (`fillMaxWidth().height(150.dp)`) — imagem de verdade fica para a Unidade 2.
- Preço à esquerda / botão à direita: `Row` com `horizontalArrangement = Arrangement.SpaceBetween`.

## Desafio 4 — Ache o bug
**Arquivo:** `Desafio4_AcheOBug.kt`

Código original com bug:
```kotlin
Row(modifier = Modifier.fillMaxWidth()) {
    Text("Total")
    Text("R$ 42,90", Modifier.weight(1f))
}
```
