package com.vungn.hilt.base.usecase

interface UseCase<PARAMS, RESULT> {
    suspend fun execute(params: PARAMS): RESULT
}