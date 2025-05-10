package org.dinostickers.collection.data

data class StickersCollection(
    val id: Long,
    val userId: Long,
    val stickers: MutableList<Long>
)
