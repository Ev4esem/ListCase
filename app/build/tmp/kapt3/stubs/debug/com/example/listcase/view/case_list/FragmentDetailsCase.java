package com.example.listcase.view.case_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\b\u0010\"\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/example/listcase/view/case_list/FragmentDetailsCase;", "Lcom/example/listcase/view/base/BaseFragment;", "Lcom/example/listcase/utils/dialogs/TimePickerFragment$TimePickerCallback;", "Lcom/example/listcase/domain/ImportanceProvider;", "()V", "binding", "Lcom/example/listcase/databinding/FragmentDetailsCaseBinding;", "caseId", "", "Ljava/lang/Long;", "viewModel", "Lcom/example/listcase/view/case_list/DetailsViewModel;", "getViewModel", "()Lcom/example/listcase/view/case_list/DetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createTodoItemWithoutId", "Lcom/example/listcase/domain/extities/TodoItem;", "deleteActivated", "", "getSelectedImportance", "Lcom/example/listcase/domain/extities/CaseImportance;", "observe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTimeSelected", "view", "Landroid/widget/TimePicker;", "hourOfDay", "", "minute", "onViewCreated", "Landroid/view/View;", "showTimePickerDialog", "Companion", "app_debug"})
public final class FragmentDetailsCase extends com.example.listcase.view.base.BaseFragment implements com.example.listcase.utils.dialogs.TimePickerFragment.TimePickerCallback, com.example.listcase.domain.ImportanceProvider {
    private java.lang.Long caseId;
    private com.example.listcase.databinding.FragmentDetailsCaseBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.listcase.view.case_list.FragmentDetailsCase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CASE_ID = "CASE_ID";
    
    public FragmentDetailsCase() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.listcase.view.case_list.DetailsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation", "ResourceAsColor"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observe() {
    }
    
    private final void deleteActivated() {
    }
    
    private final com.example.listcase.domain.extities.TodoItem createTodoItemWithoutId() {
        return null;
    }
    
    private final void showTimePickerDialog() {
    }
    
    @java.lang.Override
    public void onTimeSelected(@org.jetbrains.annotations.Nullable
    android.widget.TimePicker view, int hourOfDay, int minute) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.listcase.domain.extities.CaseImportance getSelectedImportance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/listcase/view/case_list/FragmentDetailsCase$Companion;", "", "()V", "CASE_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}