package com.example.listcase.view.case_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.domain.repository.CaseRepository
import com.example.listcase.view.base.BaseViewModel
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


class DetailsViewModel @AssistedInject constructor(
    val repository : CaseRepository,
) : BaseViewModel() {



    fun updateListItem(item : TodoItem?) = viewModelScope.launch {
        repository.updateTodo(item)
    }

    fun deleteCaseItem(caseId : Long) = viewModelScope.launch {
        repository.deleteCase(caseId)
    }

    fun insertCaseItemIntoDb(todoItem : TodoItem) = viewModelScope.launch {
        repository.insertCase(todoItem)
    }

    fun getCaseById(caseId : Long) : LiveData<TodoItem>? {
        return repository.getCaseById(caseId)
    }

    @AssistedFactory
    interface Factory {
        fun create() : DetailsViewModel
    }

}