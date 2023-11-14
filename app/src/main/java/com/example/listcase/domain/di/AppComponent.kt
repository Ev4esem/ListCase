package com.example.listcase.domain.di

import android.content.Context
import com.example.listcase.view.auth.AuthViewModel
import com.example.listcase.view.case_list.DetailsViewModel
import com.example.listcase.view.case_list.ListCaseViewModel
import dagger.Component
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Scope

@Component(modules = [AppModule::class], dependencies = [AppDeps::class])
@AppScope
interface AppComponent {


    fun listViewModel() : ListCaseViewModel.Factory
    fun detailsViewModel() : DetailsViewModel.Factory
    fun authViewModel() : AuthViewModel.Factory


    @Component.Builder
    interface Builder {

        fun appDeps(appDeps : AppDeps) : Builder

        fun build() : AppComponent

    }

}

interface AppDeps {

    val context : Context

}

@Module(includes = [DaggerCaseModule::class,DataBaseModule::class,DaggerAuthModule::class])
@DisableInstallInCheck
class AppModule



@Scope
annotation class AppScope