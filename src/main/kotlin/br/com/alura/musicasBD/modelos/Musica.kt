package br.com.alura.musicasBD.modelos

class Musica(
    val titulo: String = "Título da música",
    val duracaoMilissegundos: Int = 0,
    val album: Album = Album(),
    val id: Int = 0,
) {
    override fun toString(): String {
        return "Música $titulo ($id) com duração (ms): $duracaoMilissegundos do álbum $album"
    }
}