package com.example.listcase.view.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/listcase/view/auth/AuthViewModel;", "Lcom/example/listcase/view/base/BaseViewModel;", "repository", "Lcom/example/listcase/domain/auth/AuthRepository;", "(Lcom/example/listcase/domain/auth/AuthRepository;)V", "_userToken", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/listcase/domain/auth/AccessTokenResponse;", "saveToken", "", "accessToken", "", "Factory", "app_debug"})
public final class AuthViewModel extends com.example.listcase.view.base.BaseViewModel {
    private final com.example.listcase.domain.auth.AuthRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.listcase.domain.auth.AccessTokenResponse> _userToken = null;
    
    @dagger.assisted.AssistedInject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.example.listcase.domain.auth.AuthRepository repository) {
        super();
    }
    
    public final void saveToken(@org.jetbrains.annotations.NotNull
    java.lang.String accessToken) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listcase/view/auth/AuthViewModel$Factory;", "", "create", "Lcom/example/listcase/view/auth/AuthViewModel;", "app_debug"})
    @dagger.assisted.AssistedFactory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.listcase.view.auth.AuthViewModel create();
    }
}