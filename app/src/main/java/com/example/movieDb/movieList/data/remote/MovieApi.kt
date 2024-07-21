package com.example.movieDb.movieList.data.remote
import com.example.movieDb.movieList.data.remote.respond.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/{category}")
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page:Int,
        @Query("api_key") apiKey: String = API_KEY

        ): MovieListDto

    companion object{
        const val  BASE_URL = "https://api.themoviedb.org/3/"
        const val  IMAGE_BASE_URL = "https://api.themoviedb.org/t/p/w500"
        const val  API_KEY = "a04d4627caef5691d76fc63b573a6f91"

    }
}