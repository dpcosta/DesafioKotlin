package br.com.alura.musicasBD.modelos

class Album(
    val titulo: String = "Título do álbum",
    val banda: Banda = Banda(),
    val id: Int = 0
) {
}