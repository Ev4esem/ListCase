package com.example.listcase.view.case_list

import androidx.lifecycle.viewModelScope
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.domain.repository.CaseRepository
import com.example.listcase.view.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListCaseViewModel @Inject constructor(
    val repository : CaseRepository
) : BaseViewModel() {

    val caseListLiveData = repository.allCase()



    fun updateListItem(item : TodoItem) = viewModelScope.launch {
        repository.updateTodo(item)
    }


    fun deleteCase(caseId : Long) = viewModelScope.launch {
        repository.deleteCase(caseId)
    }

}