package com.example.listcase.view.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.listcase.R
import com.example.listcase.databinding.FragmentAuthBinding
import com.example.listcase.view.base.BaseFragment
import com.yandex.authsdk.YandexAuthException
import com.yandex.authsdk.YandexAuthLoginOptions
import com.yandex.authsdk.YandexAuthOptions
import com.yandex.authsdk.YandexAuthSdk
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthFragment : BaseFragment(R.layout.fragment_auth) {


    private lateinit var sdk : YandexAuthSdk
    private lateinit var binding : FragmentAuthBinding
    override val viewModel by viewModels<AuthViewModel>()

    override fun onCreateView(
        inflater : LayoutInflater,
        container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAuthBinding.bind(view)
        sdk = YandexAuthSdk(
            requireContext(),
            YandexAuthOptions(requireContext(),true,0)
        )

    }

    override fun onActivityCreated(savedInstanceState : Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.authButton.setOnClickListener {
            val loginOptions = YandexAuthLoginOptions.Builder().build()
            val intent = sdk.createLoginIntent(loginOptions)

            startActivityForResult(intent, REQUEST_LOGIN_SDK)
        }
    }

    override fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_LOGIN_SDK) {

            try {
                val yandexAuthToken = sdk.extractToken(resultCode, data)
                yandexAuthToken?.let {
                    val accessToken = it.value
                    viewModel.saveToken(accessToken)
                    findNavController().navigate(R.id.action_authFragment_to_fragmentListCase)
                }
            } catch (e : YandexAuthException) {
                throw e
            }

        }
    }
    companion object {
        private const val REQUEST_LOGIN_SDK = 1
    }
}