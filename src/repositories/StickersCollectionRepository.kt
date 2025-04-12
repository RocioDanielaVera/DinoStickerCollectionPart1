package repositories

import data.StickersCollection

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

    fun get(): List<StickersCollection> {
        return emptyList()
    }

}