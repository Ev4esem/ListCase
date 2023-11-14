package com.example.listcase.domain.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/listcase/domain/auth/InMemoryAuthDataSource;", "Lcom/example/listcase/domain/auth/AuthRepository;", "dataBase", "Lcom/example/listcase/domain/MainDataBase;", "(Lcom/example/listcase/domain/MainDataBase;)V", "dao", "Lcom/example/listcase/domain/AuthDao;", "getUserToken", "Lcom/example/listcase/domain/auth/AccessTokenResponse;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToken", "", "userToken", "(Lcom/example/listcase/domain/auth/AccessTokenResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class InMemoryAuthDataSource implements com.example.listcase.domain.auth.AuthRepository {
    private final com.example.listcase.domain.AuthDao dao = null;
    
    @javax.inject.Inject
    public InMemoryAuthDataSource(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.MainDataBase dataBase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertToken(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.auth.AccessTokenResponse userToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getUserToken(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.listcase.domain.auth.AccessTokenResponse> continuation) {
        return null;
    }
}