package com.example.listcase.view.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/listcase/view/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "layoutId", "", "(I)V", "viewModel", "Lcom/example/listcase/view/base/BaseViewModel;", "getViewModel", "()Lcom/example/listcase/view/base/BaseViewModel;", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    
    public BaseFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.listcase.view.base.BaseViewModel getViewModel();
}