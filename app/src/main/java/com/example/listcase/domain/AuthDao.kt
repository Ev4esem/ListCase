package com.example.listcase.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.listcase.domain.auth.AccessTokenResponse

@Dao
interface AuthDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToken(userToken : AccessTokenResponse)

    @Query("SELECT * FROM user_tokens WHERE id = :userId")
    suspend fun getToken(userId : Int) : AccessTokenResponse?

}