package com.example.listcase.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.domain.repository.CaseRepository

class FakeCaseRepository : CaseRepository {

    private val caseItems = mutableListOf<TodoItem>()

     private val observableAllCaseItems = MutableLiveData<List<TodoItem>>(caseItems)

     private fun refreshLiveData() {
          observableAllCaseItems.postValue(caseItems)
     }

     override fun allCase() : LiveData<List<TodoItem>> {
          return observableAllCaseItems
     }

     override suspend fun insertCase(case : TodoItem) {
          caseItems.add(case)
          refreshLiveData()
     }

    override fun getCaseById(caseId : Long) : LiveData<TodoItem> {
        TODO()
    }

    override suspend fun deleteCase(caseId : Long) {
        caseItems.removeAt(caseId.toInt())
        refreshLiveData()
    }

     override suspend fun updateTodo(caseTodo : TodoItem?) {
          caseItems.contains(caseTodo)
          refreshLiveData()
     }

}