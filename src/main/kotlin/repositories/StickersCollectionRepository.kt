package org.dinostickers.collection.repositories
import org.dinostickers.collection.repositories.StickersRepository
import org.dinostickers.collection.data.StickersCollection
import org.dinostickers.collection.data.User


object StickersCollectionRepository {

    private val stickersCollections = mutableListOf<StickersCollection>()

    init {
        stickersCollections.add(
            StickersCollection(
                1L,
                1510L,
                mutableListOf(1L, 3L, 12L, 27L, 5L, 19L, 8L, 30L, 2L, 14L, 22L, 9L)
            )
        )
        stickersCollections.add(
            StickersCollection(
                2L,
                1504L,
                mutableListOf(1L, 3L, 6L, 17L, 30L, 11L, 24L, 3L, 29L, 18L, 6L, 10L)
            )
        )
        stickersCollections.add(
            StickersCollection(
                3L,
                2802L,
                mutableListOf(1L, 3L, 25L, 7L, 14L, 30L, 2L, 12L, 28L, 19L, 5L, 25L)
            )
        )
    }

    fun get(userId:Long): List<StickersCollection> {
        val lista = stickersCollections.filter { it.userId == userId }
        return lista
    }


    fun addStickersToCollectionByUserId(stickers: List<Long>, userId: Long) {
        get(userId).map { it.stickers.addAll(stickers) }
    }

    fun obtenerFiguritasFaltantes(allStickerIds: List<Long>, userSticker: List<Long>): List<Long> {
        val userSet = userSticker.toSet()
        return allStickerIds.filter { it !in userSet }
    }

    fun showStickersCollection(user: User?): String {
        val listaUsuario = get(user?.id !!)

        val repetidas = listaUsuario.flatMap{it.stickers}.groupingBy { it }.eachCount()
        val filtradas = repetidas.filter { it.value > 1 }

        val filtrarSticker: List<Long> = StickersRepository.getStickers().map { it.id }
        val filtrarListaUsuario = listaUsuario.flatMap { it.stickers }

        // allStickerIds.filter { it !in stickers.toSet() }
        // StickersRepository.getStickers().filter { it != listaUsuario.toSet() }
        val losQueFaltan = obtenerFiguritasFaltantes(filtrarSticker, filtrarListaUsuario)
        return """
            LISTA DE USUARIO = $listaUsuario
            LAS QUE FALTAN: $losQueFaltan
            REPETIDAS: $repetidas
            FILTRADAS: $filtradas
            REPETIDAS EN LLAVES: ${listaUsuario.groupingBy { it }.eachCount()}
        """.trimIndent()
    }

}