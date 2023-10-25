package com.example.listcase.view.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.listcase.domain.auth.AccessTokenResponse
import com.example.listcase.domain.auth.AuthRepository
import com.example.listcase.view.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor (
    private val repository : AuthRepository
) : BaseViewModel() {

    private val _userToken = MutableLiveData<AccessTokenResponse?>()

    fun saveToken(accessToken : String) {
        val userToken = AccessTokenResponse(id = 1, accessToken = accessToken)
        viewModelScope.launch {
            repository.insertToken(userToken)
            _userToken.postValue(userToken)
        }
    }
}