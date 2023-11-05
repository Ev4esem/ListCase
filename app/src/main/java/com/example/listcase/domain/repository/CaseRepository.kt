package com.example.listcase.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.listcase.domain.extities.TodoItem

interface CaseRepository {

    fun allCase() : LiveData<List<TodoItem>>

    suspend fun insertCase(case : TodoItem)

    fun getCaseById(caseId : Long) : LiveData<TodoItem>?
    /**
     * Delete case
     * */
    suspend fun deleteCase(caseId : Long)

    /**
     * Update case
     * */
    suspend fun updateTodo(caseTodo : TodoItem?)
}