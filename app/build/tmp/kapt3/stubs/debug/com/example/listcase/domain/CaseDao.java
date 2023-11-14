package com.example.listcase.domain;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/listcase/domain/CaseDao;", "", "deleteTodo", "", "caseId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllTodo", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/listcase/domain/extities/TodoItem;", "getCaseById", "Landroidx/lifecycle/LiveData;", "insertTodo", "itemTodo", "(Lcom/example/listcase/domain/extities/TodoItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTodo", "caseItem", "app_debug"})
public abstract interface CaseDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM todo_item")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.listcase.domain.extities.TodoItem>> getAllTodo();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM todo_item WHERE id = :caseId ")
    public abstract androidx.lifecycle.LiveData<com.example.listcase.domain.extities.TodoItem> getCaseById(long caseId);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertTodo(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.extities.TodoItem itemTodo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM todo_item WHERE id = :caseId")
    public abstract java.lang.Object deleteTodo(long caseId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateTodo(@org.jetbrains.annotations.Nullable
    com.example.listcase.domain.extities.TodoItem caseItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}