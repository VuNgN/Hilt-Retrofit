package com.vungn.hilt.data.reponsitory.impl

import com.vungn.hilt.data.reponsitory.FilmRepo
import com.vungn.hilt.data.restful.ApiService

class FilmRepoImpl(private val apiService: ApiService): FilmRepo {
    override suspend fun getFilm() = apiService.getFilms()
}