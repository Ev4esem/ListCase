package com.example.listcase.domain.auth

import com.example.listcase.domain.MainDataBase
import javax.inject.Inject
import javax.inject.Singleton


class InMemoryAuthDataSource @Inject constructor(
    dataBase : MainDataBase
) : AuthRepository {

    private val dao = dataBase.authDao()


    override suspend fun insertToken(userToken : AccessTokenResponse) {
        dao.insertToken(userToken)
    }

    override suspend fun getUserToken(userId : Int) : AccessTokenResponse? {
       return dao.getToken(userId)
    }

}