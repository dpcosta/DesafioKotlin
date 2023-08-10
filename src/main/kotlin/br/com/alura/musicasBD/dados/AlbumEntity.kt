package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.modelos.Banda
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "albuns")
class AlbumEntity(
    val titulo: String = "Título do álbum",
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue
    val id: Int = 0
)