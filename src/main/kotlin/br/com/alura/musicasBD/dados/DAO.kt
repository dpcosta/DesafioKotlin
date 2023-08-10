package br.com.alura.musicasBD.dados

import javax.persistence.EntityManager

abstract class DAO<TModel,TEntity>(
    val manager: EntityManager,
    val entityType: Class<TEntity>) {

    abstract fun toModel(e: TEntity): TModel
    abstract fun toEntity(m: TModel): TEntity
    open fun getLista(): List<TModel> {
        val query = manager
            .createQuery("FROM ${entityType.simpleName}", entityType)
        return query.resultList.map { e -> toModel(e) }
    }

    open fun adicionar(m: TModel) {
        val entity = toEntity(m)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }

    private fun recuperarEntityPeloId(id: Int): TEntity {
        val query = manager
            .createQuery("FROM ${entityType.simpleName} WHERE id = :id", entityType)
        return query.singleResult
    }

    open fun recuperarPeloId(id: Int): TModel {
        return toModel(recuperarEntityPeloId(id))
    }

    open fun apagar(id: Int) {
        val entity = recuperarEntityPeloId(id)
        manager.transaction.begin()
        manager.remove(entity)
        manager.transaction.commit()
    }
}