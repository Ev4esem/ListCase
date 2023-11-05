package com.example.listcase.domain.di

import android.content.Context
import androidx.room.Room
import com.example.listcase.domain.MainDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Singleton
    @Provides
    fun provideAppDataBase(@ApplicationContext context : Context) : MainDataBase {
        return Room.databaseBuilder(
            context.applicationContext,
            MainDataBase::class.java,
            "app_water.db"
        ).build()
    }
}