package com.vungn.hilt.data.restful

import com.vungn.hilt.data.model.Film
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {
    @GET("films")
    suspend fun getFilms(): List<Film>

    @GET("films/{id}")
    suspend fun getFilmById(@Path("id") id: String): Film
}