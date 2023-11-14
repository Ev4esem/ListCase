package com.example.listcase

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.preference.PreferenceManager
import com.example.listcase.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val themeId = if (isDarkThemeEnabled()) R.style.Theme_AppCompat_DayNight else R.style.Theme_AppCompat_DayNight
        setTheme(themeId)
        setContentView(binding.root)



    }

    private fun isDarkThemeEnabled(): Boolean {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val themeKey = sharedPreferences.getString("theme_key", "Light")
        return themeKey == "Dark"
    }
}