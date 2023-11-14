package com.example.listcase.domain;

import java.lang.System;

@androidx.room.Database(entities = {com.example.listcase.domain.extities.TodoItem.class, com.example.listcase.domain.auth.AccessTokenResponse.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/listcase/domain/MainDataBase;", "Landroidx/room/RoomDatabase;", "()V", "authDao", "Lcom/example/listcase/domain/AuthDao;", "getDao", "Lcom/example/listcase/domain/CaseDao;", "app_debug"})
public abstract class MainDataBase extends androidx.room.RoomDatabase {
    
    public MainDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.listcase.domain.CaseDao getDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.listcase.domain.AuthDao authDao();
}