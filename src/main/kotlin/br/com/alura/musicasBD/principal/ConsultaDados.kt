package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.dados.MusicaDAO

fun main() {
    val manager = Banco.getEntityManager()
    val musicaDAO = MusicaDAO(manager)

    musicaDAO.getLista().forEach { m -> println(m) }

    manager.close()
}
