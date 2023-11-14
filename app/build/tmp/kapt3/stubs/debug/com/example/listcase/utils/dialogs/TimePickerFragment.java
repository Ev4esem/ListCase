package com.example.listcase.utils.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/listcase/utils/dialogs/TimePickerFragment;", "Landroid/app/TimePickerDialog;", "context", "Landroid/content/Context;", "listener", "Lcom/example/listcase/utils/dialogs/TimePickerFragment$TimePickerCallback;", "calendar", "Landroid/icu/util/Calendar;", "(Landroid/content/Context;Lcom/example/listcase/utils/dialogs/TimePickerFragment$TimePickerCallback;Landroid/icu/util/Calendar;)V", "TimePickerCallback", "app_debug"})
public final class TimePickerFragment extends android.app.TimePickerDialog {
    private final android.content.Context context = null;
    private final com.example.listcase.utils.dialogs.TimePickerFragment.TimePickerCallback listener = null;
    private final android.icu.util.Calendar calendar = null;
    
    public TimePickerFragment(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.listcase.utils.dialogs.TimePickerFragment.TimePickerCallback listener, @org.jetbrains.annotations.NotNull
    android.icu.util.Calendar calendar) {
        super(null, null, 0, 0, false);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/listcase/utils/dialogs/TimePickerFragment$TimePickerCallback;", "", "onTimeSelected", "", "view", "Landroid/widget/TimePicker;", "hourOfDay", "", "minute", "app_debug"})
    public static abstract interface TimePickerCallback {
        
        public abstract void onTimeSelected(@org.jetbrains.annotations.Nullable
        android.widget.TimePicker view, int hourOfDay, int minute);
    }
}