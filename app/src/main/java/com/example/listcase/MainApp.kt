package com.example.listcase

import android.app.Application
import android.content.Context
import com.example.listcase.domain.di.AppDeps
import com.example.listcase.domain.di.AppComponent
import com.example.listcase.domain.di.DaggerAppComponent


class MainApp : Application() {

    lateinit var appComponent : AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appDeps(AppDepsImpl())
            .build()
    }

    private inner class AppDepsImpl : AppDeps {

        override val context : Context = this@MainApp

    }

}

val Context.appComponent: AppComponent
    get() = when (this) {
        is MainApp -> appComponent
        else -> applicationContext.appComponent
    }

