package br.com.deciomontanhani.jogosfavoritos.model

data class Jogo (
    val resourceId: Int,
    val nome: String,
    val anoLancamento: Int,
    val descricao: String
)