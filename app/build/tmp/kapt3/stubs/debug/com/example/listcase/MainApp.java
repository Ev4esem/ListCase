package com.example.listcase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/listcase/MainApp;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/example/listcase/domain/di/AppComponent;", "getAppComponent", "()Lcom/example/listcase/domain/di/AppComponent;", "setAppComponent", "(Lcom/example/listcase/domain/di/AppComponent;)V", "onCreate", "", "AppDepsImpl", "app_debug"})
public final class MainApp extends android.app.Application {
    public com.example.listcase.domain.di.AppComponent appComponent;
    
    public MainApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.listcase.domain.di.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.di.AppComponent p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/listcase/MainApp$AppDepsImpl;", "Lcom/example/listcase/domain/di/AppDeps;", "(Lcom/example/listcase/MainApp;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "app_debug"})
    final class AppDepsImpl implements com.example.listcase.domain.di.AppDeps {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        
        public AppDepsImpl() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.content.Context getContext() {
            return null;
        }
    }
}