package com.example.listcase.domain.auth

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_tokens")
data class AccessTokenResponse(
   @PrimaryKey val id : Int,
   @ColumnInfo(name = "access_token") val accessToken : String
)

