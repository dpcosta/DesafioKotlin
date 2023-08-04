package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.modelos.Album
import br.com.alura.musicasBD.modelos.Banda
import br.com.alura.musicasBD.modelos.Musica

fun main() {
    val manager = Banco.getEntityManager()

    val ironMaiden = Banda("Iron Maiden")

    // álbum Killers
    val killers = Album("Killers", ironMaiden)
    val wrathchild = Musica("Wrathchild", 3000, killers)
    val murders = Musica("Murders in the rue Morgue", 4000, killers)

    // álbum Piece of Mind
    val pieceOfMind = Album("Piece of Mind", ironMaiden)
    val revelations = Musica("Revelations", 3000, pieceOfMind)
    val flightOfIcarus = Musica("Flight of Icarus", 3000, pieceOfMind)
    val theTrooper = Musica("The Trooper", 4000, pieceOfMind)

    // persistir banda, álbuns e músicas

    manager.close()
}