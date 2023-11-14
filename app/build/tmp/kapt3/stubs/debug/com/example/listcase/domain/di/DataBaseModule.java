package com.example.listcase.domain.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/listcase/domain/di/DataBaseModule;", "", "()V", "getAuthDao", "Lcom/example/listcase/domain/AuthDao;", "dataBase", "Lcom/example/listcase/domain/MainDataBase;", "getCaseDao", "Lcom/example/listcase/domain/CaseDao;", "provideAppDataBase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.migration.DisableInstallInCheck
@dagger.Module
public final class DataBaseModule {
    
    public DataBaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @AppScope
    @dagger.Provides
    public final com.example.listcase.domain.MainDataBase provideAppDataBase(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @AppScope
    public final com.example.listcase.domain.CaseDao getCaseDao(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.MainDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @AppScope
    public final com.example.listcase.domain.AuthDao getAuthDao(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.MainDataBase dataBase) {
        return null;
    }
}