package com.example.movieDb.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDataBase : RoomDatabase() {
    abstract val movieDAO: MovieDAO
}