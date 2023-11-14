package com.example.listcase.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0019\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/listcase/domain/repository/InMemoryCaseDataSource;", "Lcom/example/listcase/domain/repository/CaseRepository;", "dataBase", "Lcom/example/listcase/domain/MainDataBase;", "(Lcom/example/listcase/domain/MainDataBase;)V", "dao", "Lcom/example/listcase/domain/CaseDao;", "allCase", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/listcase/domain/extities/TodoItem;", "deleteCase", "", "caseId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCaseById", "insertCase", "case", "(Lcom/example/listcase/domain/extities/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodo", "caseTodo", "app_debug"})
public final class InMemoryCaseDataSource implements com.example.listcase.domain.repository.CaseRepository {
    private final com.example.listcase.domain.CaseDao dao = null;
    
    @javax.inject.Inject
    public InMemoryCaseDataSource(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.MainDataBase dataBase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.example.listcase.domain.extities.TodoItem>> allCase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertCase(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem p0_1523096, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteCase(long caseId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateTodo(@org.jetbrains.annotations.Nullable
    com.example.listcase.domain.extities.TodoItem caseTodo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public androidx.lifecycle.LiveData<com.example.listcase.domain.extities.TodoItem> getCaseById(long caseId) {
        return null;
    }
}