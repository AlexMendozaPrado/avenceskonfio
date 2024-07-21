package com.example.movieDb.di

import android.app.Application
import com.example.movieDb.movieList.data.local.movie.MovieDataBase
import com.example.movieDb.movieList.data.remote.MovieApi
import com.example.movieDb.movieList.data.repository.MovieListRepositoryImpl
import com.example.movieDb.movieList.domain.Repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
movieListRepositoryImpl : MovieListRepositoryImpl
    ): MovieListRepository

}