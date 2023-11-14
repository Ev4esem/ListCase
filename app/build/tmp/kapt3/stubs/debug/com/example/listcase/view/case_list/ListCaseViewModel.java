package com.example.listcase.view.case_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/listcase/view/case_list/ListCaseViewModel;", "Lcom/example/listcase/view/base/BaseViewModel;", "repository", "Lcom/example/listcase/domain/repository/CaseRepository;", "(Lcom/example/listcase/domain/repository/CaseRepository;)V", "caseListLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/listcase/domain/extities/TodoItem;", "getCaseListLiveData", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lcom/example/listcase/domain/repository/CaseRepository;", "deleteCase", "Lkotlinx/coroutines/Job;", "caseId", "", "updateListItem", "item", "Factory", "app_debug"})
public final class ListCaseViewModel extends com.example.listcase.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.listcase.domain.repository.CaseRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.listcase.domain.extities.TodoItem>> caseListLiveData = null;
    
    @dagger.assisted.AssistedInject
    public ListCaseViewModel(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.repository.CaseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.listcase.domain.repository.CaseRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.listcase.domain.extities.TodoItem>> getCaseListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateListItem(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteCase(long caseId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listcase/view/case_list/ListCaseViewModel$Factory;", "", "create", "Lcom/example/listcase/view/case_list/ListCaseViewModel;", "app_debug"})
    @dagger.assisted.AssistedFactory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.listcase.view.case_list.ListCaseViewModel create();
    }
}