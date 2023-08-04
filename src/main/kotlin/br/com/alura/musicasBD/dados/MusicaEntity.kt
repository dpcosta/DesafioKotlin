package br.com.alura.musicasBD.dados

import javax.persistence.*

@Entity
@Table(name = "musicas")
class MusicaEntity(
    val titulo: String = "Título da música",
    val duracaoMilissegundos: Int = 0,
    @ManyToOne val album: AlbumEntity = AlbumEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
) {
}