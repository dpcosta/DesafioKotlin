package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.extensions.toEntity
import br.com.alura.musicasBD.extensions.toModel
import br.com.alura.musicasBD.modelos.Musica
import javax.persistence.EntityManager

class MusicaDAO(manager: EntityManager): DAO<Musica, MusicaEntity>(manager, MusicaEntity::class.java) {
    override fun toEntity(objeto: Musica): MusicaEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: MusicaEntity): Musica {
        return entity.toModel()
    }
}