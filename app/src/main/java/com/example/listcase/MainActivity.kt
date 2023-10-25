package com.example.listcase

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.preference.PreferenceManager
import com.example.listcase.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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

    override fun onSupportNavigateUp() : Boolean {
        val navController = findNavController(R.id.fragmentListCase)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    private fun isDarkThemeEnabled(): Boolean {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val themeKey = sharedPreferences.getString("theme_key", "Light")
        return themeKey == "Dark"
    }
}