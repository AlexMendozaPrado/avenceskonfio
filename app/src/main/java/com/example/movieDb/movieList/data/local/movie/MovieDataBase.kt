package com.example.movieDb.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MovieEntity::class],
    version = 1,
    exportSchema = false // Deshabilitar la exportación del esquema

)
abstract class MovieDataBase : RoomDatabase() {
    abstract val movieDAO: MovieDAO
}