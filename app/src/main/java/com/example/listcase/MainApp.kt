package com.example.listcase

import android.app.Application
import android.os.Build
import androidx.core.content.ContextCompat
import androidx.preference.PreferenceManager
import com.example.listcase.utils.ThemeManager
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApp : Application()