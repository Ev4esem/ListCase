package com.example.listcase.view.case_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0017J\u0016\u0010%\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0&H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/example/listcase/view/case_list/FragmentListCase;", "Lcom/example/listcase/view/base/BaseFragment;", "Lcom/example/listcase/view/case_list/CaseListAdapter$Listener;", "()V", "adapter", "Lcom/example/listcase/view/case_list/CaseListAdapter;", "binding", "Lcom/example/listcase/databinding/FragmentListCaseBinding;", "swipeDelete", "Lcom/example/listcase/utils/SwipeToDeleteCallbacks;", "themeManager", "Lcom/example/listcase/utils/ThemeManager;", "viewModel", "Lcom/example/listcase/view/case_list/ListCaseViewModel;", "getViewModel", "()Lcom/example/listcase/view/case_list/ListCaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "delete", "", "caseId", "", "initRcView", "initSwipeToDelete", "observer", "onClick", "Lcom/example/listcase/domain/extities/TodoItem;", "onClickChecked", "todoItem", "state", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "updateCheckedItemCount", "", "app_debug"})
public final class FragmentListCase extends com.example.listcase.view.base.BaseFragment implements com.example.listcase.view.case_list.CaseListAdapter.Listener {
    private com.example.listcase.utils.ThemeManager themeManager;
    private com.example.listcase.databinding.FragmentListCaseBinding binding;
    private com.example.listcase.view.case_list.CaseListAdapter adapter;
    private com.example.listcase.utils.SwipeToDeleteCallbacks swipeDelete;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public FragmentListCase() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.listcase.view.case_list.ListCaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"PrivateResource"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRcView() {
    }
    
    private final void observer() {
    }
    
    @java.lang.Override
    public void onClickChecked(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem todoItem, int state) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem caseId) {
    }
    
    private final void initSwipeToDelete() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void updateCheckedItemCount(java.util.List<com.example.listcase.domain.extities.TodoItem> todoItem) {
    }
    
    @java.lang.Override
    public void delete(long caseId) {
    }
}