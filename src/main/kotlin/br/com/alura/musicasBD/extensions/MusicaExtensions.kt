package br.com.alura.musicasBD.extensions

import br.com.alura.musicasBD.dados.MusicaEntity
import br.com.alura.musicasBD.modelos.Musica

fun Musica.toEntity(): MusicaEntity {
    return MusicaEntity(this.titulo, this.duracaoMilissegundos, this.album.toEntity(), this.id)
}

fun MusicaEntity.toModel(): Musica {
    return Musica(this.titulo, this.duracaoMilissegundos, this.album.toModel(), this.id)
}
