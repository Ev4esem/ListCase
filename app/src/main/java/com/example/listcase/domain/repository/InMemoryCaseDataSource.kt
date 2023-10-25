package com.example.listcase.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.example.listcase.domain.MainDataBase
import com.example.listcase.domain.extities.TodoItem
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryCaseDataSource @Inject constructor(
    dataBase : MainDataBase
) : CaseRepository {
    private val dao = dataBase.getDao()

    override fun allCase() : LiveData<List<TodoItem>> = dao.getAllTodo().asLiveData()

    override suspend fun insertCase(case : TodoItem) {
        dao.insertTodo(case)
    }

    override suspend fun deleteCase(caseId : Long) {
        dao.deleteTodo(caseId)
    }

    override suspend fun updateTodo(caseTodo : TodoItem?) {
        dao.updateTodo(caseTodo)
    }

    override fun getCaseById(caseId : Long) : LiveData<TodoItem>? {
       return dao.getCaseById(caseId)
    }

}
