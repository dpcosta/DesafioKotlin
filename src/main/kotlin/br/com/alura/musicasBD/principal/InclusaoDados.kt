package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.AlbumDAO
import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.dados.BandaDAO
import br.com.alura.musicasBD.dados.MusicaDAO
import br.com.alura.musicasBD.modelos.Album
import br.com.alura.musicasBD.modelos.Banda
import br.com.alura.musicasBD.modelos.Musica

fun main() {
    val manager = Banco.getEntityManager()

    // Bandas
    val bandaDAO = BandaDAO(manager)

    bandaDAO.adicionar(Banda("Iron Maiden"))
    val ironMaidenBD = bandaDAO.recuperarPeloID(1)

    // Álbuns
    val albumDAO = AlbumDAO(manager)

    albumDAO.adicionar(Album("Killers", ironMaidenBD))
    val killersBD = albumDAO.recuperarPeloID(1)

    albumDAO.adicionar(Album("Piece of Mind", ironMaidenBD))
    val pieceOfMindBD = albumDAO.recuperarPeloID(2)

    // Músicas
    val musicaDAO = MusicaDAO(manager)

    val wrathchild = Musica("Wrathchild", 3000, killersBD)
    val murders = Musica("Murders in the rue Morgue", 4000, killersBD)

    val revelations = Musica("Revelations", 3000, pieceOfMindBD)
    val flightOfIcarus = Musica("Flight of Icarus", 3000, pieceOfMindBD)
    val theTrooper = Musica("The Trooper", 4000, pieceOfMindBD)

    val musicas = listOf<Musica>(wrathchild, murders, revelations, flightOfIcarus, theTrooper)
    musicas.forEach { m -> musicaDAO.adicionar(m) }

    manager.close()
}