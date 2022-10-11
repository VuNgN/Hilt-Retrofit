package com.vungn.hilt.data.restful

import com.vungn.hilt.data.model.Film
import retrofit2.http.GET


interface ApiService {
    @GET("films")
    suspend fun getFilms(): List<Film>
}