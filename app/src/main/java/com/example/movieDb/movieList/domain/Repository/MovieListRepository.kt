package com.example.movieDb.movieList.domain.Repository

import com.example.movieDb.movieList.domain.model.Movie
import com.example.movieDb.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page : Int

    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}