package com.vungn.hilt.usecase.main

import android.util.Log
import com.vungn.hilt.base.usecase.UseCase
import com.vungn.hilt.data.reponsitory.FilmRepo
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject
import kotlin.random.Random

class GetRandomId @Inject constructor(private val filmRepo: FilmRepo) : UseCase<Unit, String> {
    override suspend fun execute(params: Unit): String = getRandomId()

    private suspend fun getRandomId(): String {
        val films = coroutineScope {
            val result = async {
                filmRepo.getFilm()
            }
            result.await()
        }
        val index = Random.nextInt(films.size - 1)
        Log.d(TAG, "getRandomId: ${films[index].id}")
        return films[index].id
    }

    companion object {
        private val TAG = GetRandomId::class.simpleName
    }
}