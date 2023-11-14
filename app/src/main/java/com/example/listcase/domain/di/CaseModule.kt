package com.example.listcase.domain.di

import com.example.listcase.domain.repository.CaseRepository
import com.example.listcase.domain.repository.InMemoryCaseDataSource
import dagger.Binds
import dagger.Module

@Module
interface DaggerCaseModule {

    @Binds
    fun bindCaseInMemoryCaseDataSource_to_CaseRepository(
        inMemoryCaseDataSource : InMemoryCaseDataSource
    ) : CaseRepository

}