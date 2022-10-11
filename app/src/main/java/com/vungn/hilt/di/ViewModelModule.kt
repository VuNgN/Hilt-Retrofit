package com.vungn.hilt.di

import com.vungn.hilt.data.reponsitory.FilmRepo
import com.vungn.hilt.data.reponsitory.impl.FilmRepoImpl
import com.vungn.hilt.data.restful.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {
    @Provides
    @ViewModelScoped
    fun provideFilmRepo(apiService: ApiService): FilmRepo {
        return FilmRepoImpl(apiService)
    }
}