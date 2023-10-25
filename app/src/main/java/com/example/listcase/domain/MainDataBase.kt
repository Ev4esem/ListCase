package com.example.listcase.domain

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.listcase.domain.auth.AccessTokenResponse
import com.example.listcase.domain.extities.TodoItem


@Database(entities = [TodoItem::class,AccessTokenResponse::class], version = 1)
abstract class MainDataBase : RoomDatabase() {


    abstract fun getDao() : CaseDao

    abstract fun authDao() : AuthDao

}