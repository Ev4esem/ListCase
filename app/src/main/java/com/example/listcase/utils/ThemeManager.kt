package com.example.listcase.utils

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager

class ThemeManager(private val context : Context) {


    fun getCurrentTheme() : Int {
         val themeKey = PreferenceManager.getDefaultSharedPreferences(context)
            .getString("theme_key","Light")
        return when(themeKey) {
            "Light" -> AppCompatDelegate.MODE_NIGHT_NO
            else -> AppCompatDelegate.MODE_NIGHT_YES
        }
    }

    fun applyTheme(theme : Int) {
        AppCompatDelegate.setDefaultNightMode(theme)
    }

}