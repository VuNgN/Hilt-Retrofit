package com.vungn.hilt.data.reponsitory.impl

import com.vungn.hilt.data.reponsitory.FilmRepo
import com.vungn.hilt.data.restful.ApiService
import javax.inject.Inject

class FilmRepoImpl @Inject constructor(private val apiService: ApiService) : FilmRepo {
    override suspend fun getFilm() = apiService.getFilms()
    override suspend fun getFilmById(id: String) = apiService.getFilmById(id)
}