package com.example.listcase.view.case_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/example/listcase/view/case_list/DetailsViewModel;", "Lcom/example/listcase/view/base/BaseViewModel;", "repository", "Lcom/example/listcase/domain/repository/CaseRepository;", "(Lcom/example/listcase/domain/repository/CaseRepository;)V", "getRepository", "()Lcom/example/listcase/domain/repository/CaseRepository;", "deleteCaseItem", "Lkotlinx/coroutines/Job;", "caseId", "", "getCaseById", "Landroidx/lifecycle/LiveData;", "Lcom/example/listcase/domain/extities/TodoItem;", "insertCaseItemIntoDb", "todoItem", "updateListItem", "item", "Factory", "app_debug"})
public final class DetailsViewModel extends com.example.listcase.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.listcase.domain.repository.CaseRepository repository = null;
    
    @dagger.assisted.AssistedInject
    public DetailsViewModel(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.repository.CaseRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.listcase.domain.repository.CaseRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateListItem(@org.jetbrains.annotations.Nullable
    com.example.listcase.domain.extities.TodoItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteCaseItem(long caseId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertCaseItemIntoDb(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem todoItem) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.lifecycle.LiveData<com.example.listcase.domain.extities.TodoItem> getCaseById(long caseId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listcase/view/case_list/DetailsViewModel$Factory;", "", "create", "Lcom/example/listcase/view/case_list/DetailsViewModel;", "app_debug"})
    @dagger.assisted.AssistedFactory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.listcase.view.case_list.DetailsViewModel create();
    }
}