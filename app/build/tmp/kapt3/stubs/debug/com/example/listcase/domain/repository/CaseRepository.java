package com.example.listcase.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/listcase/domain/repository/CaseRepository;", "", "allCase", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/listcase/domain/extities/TodoItem;", "deleteCase", "", "caseId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCaseById", "insertCase", "case", "(Lcom/example/listcase/domain/extities/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodo", "caseTodo", "app_debug"})
public abstract interface CaseRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.listcase.domain.extities.TodoItem>> allCase();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertCase(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem p0_1523096, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract androidx.lifecycle.LiveData<com.example.listcase.domain.extities.TodoItem> getCaseById(long caseId);
    
    /**
     * Delete case
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCase(long caseId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    /**
     * Update case
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTodo(@org.jetbrains.annotations.Nullable
    com.example.listcase.domain.extities.TodoItem caseTodo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}