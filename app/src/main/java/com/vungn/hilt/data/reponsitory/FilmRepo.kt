package com.vungn.hilt.data.reponsitory

import com.vungn.hilt.data.model.Film

interface FilmRepo {
    suspend fun getFilm(): List<Film>
    suspend fun getFilmById(id: String): Film
}