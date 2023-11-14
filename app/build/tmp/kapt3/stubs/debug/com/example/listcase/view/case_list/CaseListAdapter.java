package com.example.listcase.view.case_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0011\u0012\u0013\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/listcase/view/case_list/CaseListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/listcase/domain/extities/TodoItem;", "Lcom/example/listcase/view/case_list/CaseListAdapter$CaseViewHolder;", "listener", "Lcom/example/listcase/view/case_list/CaseListAdapter$Listener;", "(Lcom/example/listcase/view/case_list/CaseListAdapter$Listener;)V", "delete", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CaseComporator", "CaseViewHolder", "Companion", "Listener", "app_debug"})
public final class CaseListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.listcase.domain.extities.TodoItem, com.example.listcase.view.case_list.CaseListAdapter.CaseViewHolder> {
    private final com.example.listcase.view.case_list.CaseListAdapter.Listener listener = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.listcase.view.case_list.CaseListAdapter.Companion Companion = null;
    public static final int CHECK_BOX = 1;
    
    public CaseListAdapter(@org.jetbrains.annotations.NotNull
    com.example.listcase.view.case_list.CaseListAdapter.Listener listener) {
        super(null);
    }
    
    public final void delete(int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.listcase.view.case_list.CaseListAdapter.CaseViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.listcase.view.case_list.CaseListAdapter.CaseViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/listcase/view/case_list/CaseListAdapter$CaseComporator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/listcase/domain/extities/TodoItem;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "compare", "", "p0", "p1", "app_debug"})
    public static final class CaseComporator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.listcase.domain.extities.TodoItem> implements java.util.Comparator<com.example.listcase.domain.extities.TodoItem> {
        
        public CaseComporator() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem oldItem, @org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem oldItem, @org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public int compare(@org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem p0, @org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem p1) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/listcase/view/case_list/CaseListAdapter$CaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "setCaseData", "", "todoItem", "Lcom/example/listcase/domain/extities/TodoItem;", "listener", "Lcom/example/listcase/view/case_list/CaseListAdapter$Listener;", "setPaintFlagAndColor", "binding", "Lcom/example/listcase/databinding/ItemCaseBinding;", "Companion", "app_debug"})
    public static final class CaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.view.View view = null;
        @org.jetbrains.annotations.NotNull
        public static final com.example.listcase.view.case_list.CaseListAdapter.CaseViewHolder.Companion Companion = null;
        
        public CaseViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getView() {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void setCaseData(@org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem todoItem, @org.jetbrains.annotations.NotNull
        com.example.listcase.view.case_list.CaseListAdapter.Listener listener) {
        }
        
        private final void setPaintFlagAndColor(com.example.listcase.databinding.ItemCaseBinding binding) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/listcase/view/case_list/CaseListAdapter$CaseViewHolder$Companion;", "", "()V", "createCaseItem", "Lcom/example/listcase/view/case_list/CaseListAdapter$CaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.listcase.view.case_list.CaseListAdapter.CaseViewHolder createCaseItem(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/example/listcase/view/case_list/CaseListAdapter$Listener;", "", "delete", "", "caseId", "", "onClick", "Lcom/example/listcase/domain/extities/TodoItem;", "onClickChecked", "todoItem", "state", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickChecked(@org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem todoItem, int state);
        
        public abstract void delete(long caseId);
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        com.example.listcase.domain.extities.TodoItem caseId);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/listcase/view/case_list/CaseListAdapter$Companion;", "", "()V", "CHECK_BOX", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}