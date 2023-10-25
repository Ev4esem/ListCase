package com.example.listcase.domain.auth

interface AuthRepository {

    suspend fun insertToken(userToken : AccessTokenResponse)

    suspend fun getUserToken(userId : Int) : AccessTokenResponse?

}