package com.vungn.hilt.usecase.main

import android.util.Log
import com.vungn.hilt.base.usecase.UseCase
import com.vungn.hilt.data.reponsitory.FilmRepo
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject

class GetAnimeName @Inject constructor(private val filmRepo: FilmRepo) : UseCase<String, String> {

    override suspend fun execute(params: String): String = getAnime(params)

    private suspend fun getAnime(id: String): String = coroutineScope {
        val result = async {
            try {
                Log.d(TAG, "getAnime with id: $id")
                filmRepo.getFilmById(id).title
            } catch (e: Exception) {
                Log.e(TAG, "getAnime: ${e.message}")
            }
        }
        result.await().toString()
    }

    companion object {
        private val TAG = GetAnimeName::class.simpleName
    }
}