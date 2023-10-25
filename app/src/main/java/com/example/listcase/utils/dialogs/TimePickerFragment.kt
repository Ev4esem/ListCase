package com.example.listcase.utils.dialogs

import android.app.TimePickerDialog
import android.content.Context
import android.icu.util.Calendar
import android.widget.TimePicker



class TimePickerFragment(
    private val context : Context,
    private val listener : TimePickerCallback,
    private val calendar : Calendar
    ) : TimePickerDialog(
        context,
        {_,hourOfDay,minute -> listener.onTimeSelected(null,hourOfDay, minute) },
        calendar.get(Calendar.HOUR_OF_DAY),
        calendar.get(Calendar.MINUTE),
        true
    ) {

    interface TimePickerCallback {
        fun onTimeSelected(view : TimePicker?,hourOfDay : Int, minute : Int)
    }
}