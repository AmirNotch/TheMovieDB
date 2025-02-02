package com.oxcoding.moviemvvm.data.api

import com.oxcoding.moviemvvm.data.vo.MovieDetails
import com.oxcoding.moviemvvm.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=6e63c2317fbe963d76c3bdc2b785f6d1&page=1
    // https://api.themoviedb.org/3/movie/299534?api_key=6e63c2317fbe963d76c3bdc2b785f6d1
    // https://api.themoviedb.org/3/

    @GET("tv/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("tv/{tv_id}")
    fun getMovieDetails(@Path("tv_id") id: Int): Single<MovieDetails>
}