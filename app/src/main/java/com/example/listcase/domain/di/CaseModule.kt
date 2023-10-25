package com.example.listcase.domain.di

import com.example.listcase.domain.repository.CaseRepository
import com.example.listcase.domain.repository.InMemoryCaseDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface CaseModule {

    @Binds
    fun bindInMemoryDataSource(
        inMemoryCaseDataSource : InMemoryCaseDataSource
    ) : CaseRepository


}