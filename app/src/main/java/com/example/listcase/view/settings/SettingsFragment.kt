package com.example.listcase.view.settings

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.example.listcase.R
import com.example.listcase.utils.ThemeManager

class SettingsFragment : PreferenceFragmentCompat() {

    private lateinit var sharedPrefs: SharedPreferences
    private lateinit var themeManager: ThemeManager
    private val prefListener = SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
        if (key == "theme_key") {
            themeManager.applyTheme(themeManager.getCurrentTheme())
        }
    }

    override fun onCreatePreferences(savedInstanceState : Bundle?, rootKey : String?) {
        setPreferencesFromResource(R.xml.settings_preference,rootKey)
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(requireContext())
        themeManager = ThemeManager(requireContext())
    }

    override fun onResume() {
        super.onResume()
        sharedPrefs.registerOnSharedPreferenceChangeListener(prefListener)
    }

    override fun onPause() {
        super.onPause()
        sharedPrefs.unregisterOnSharedPreferenceChangeListener(prefListener)
    }

}