package com.example.listcase.view.case_list

import androidx.lifecycle.viewModelScope
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.domain.repository.CaseRepository
import com.example.listcase.view.base.BaseViewModel
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.launch


class ListCaseViewModel @AssistedInject constructor(
    val repository : CaseRepository
) : BaseViewModel() {

    val caseListLiveData = repository.allCase()



    fun updateListItem(item : TodoItem) = viewModelScope.launch {
        repository.updateTodo(item)
    }


    fun deleteCase(caseId : Long) = viewModelScope.launch {
        repository.deleteCase(caseId)
    }

    @AssistedFactory
    interface Factory {
        fun create() : ListCaseViewModel
    }

}