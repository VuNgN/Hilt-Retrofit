package com.vungn.hilt.di

import com.vungn.hilt.data.reponsitory.FilmRepo
import com.vungn.hilt.data.reponsitory.impl.FilmRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ViewModelModule {
    @Binds
    abstract fun provideFilmRepo(impl: FilmRepoImpl): FilmRepo
}