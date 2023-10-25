package com.example.listcase.domain.di

import com.example.listcase.domain.auth.AuthRepository
import com.example.listcase.domain.auth.InMemoryAuthDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AuthModule {

    @Binds
    fun bindInMemoryAuthDataSource(
        inMemoryAuthDataSource : InMemoryAuthDataSource
    ) : AuthRepository

}