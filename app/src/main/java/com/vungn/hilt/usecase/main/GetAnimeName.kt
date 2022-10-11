package com.vungn.hilt.usecase.main

import android.util.Log
import com.vungn.hilt.base.usecase.UseCase
import com.vungn.hilt.data.reponsitory.FilmRepo
import com.vungn.hilt.data.restful.ApiService
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import kotlin.random.Random

class GetAnimeName @Inject constructor(private val filmRepo: FilmRepo) : UseCase<String, String> {

    override suspend fun execute(params: String): String {
        return getAnime(params);
    }

    private fun getAnime(params: String): String =
        runBlocking {
            val result = async {
                try {
                    filmRepo.getFilm().size
                } catch(e: Exception) {
                    Log.e(TAG, "getAnime: ${e.message}")
                }
            }
            result.await().toString()
        }

    companion object {
        private val TAG = GetAnimeName::class.simpleName
    }
}