package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.modelos.Banda
import javax.persistence.*

@Entity
@Table(name = "albuns")
class AlbumEntity(
    val titulo: String = "Título do álbum",
    @ManyToOne val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0) {
}