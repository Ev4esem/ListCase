package com.example.listcase.domain.di

import com.example.listcase.domain.auth.AuthRepository
import com.example.listcase.domain.auth.InMemoryAuthDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
interface DaggerAuthModule {

    @Binds
    fun bindInMemoryAuthDataSource_to_AuthRepository(
        inMemoryAuthDataSource : InMemoryAuthDataSource
    ) : AuthRepository

}