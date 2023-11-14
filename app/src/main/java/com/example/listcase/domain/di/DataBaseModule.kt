package com.example.listcase.domain.di

import android.content.Context
import androidx.room.Room
import com.example.listcase.domain.AuthDao
import com.example.listcase.domain.CaseDao
import com.example.listcase.domain.MainDataBase
import dagger.Module
import dagger.Provides

@Module
class DataBaseModule {

    @Provides
    @AppScope
    fun provideAppDataBase(context : Context) : MainDataBase {
        return Room.databaseBuilder(
            context.applicationContext,
            MainDataBase::class.java,
            "app_water.db"
        ).build()
    }

    @AppScope
    @Provides
    fun getCaseDao(dataBase : MainDataBase) : CaseDao {
        return dataBase.getDao()
    }

    @AppScope
    @Provides
    fun getAuthDao(dataBase : MainDataBase) : AuthDao {
        return dataBase.authDao()
    }

}
