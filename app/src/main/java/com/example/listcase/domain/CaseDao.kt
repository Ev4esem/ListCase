package com.example.listcase.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.listcase.domain.extities.CaseImportance
import com.example.listcase.domain.extities.TodoItem
import kotlinx.coroutines.flow.Flow

@Dao
interface CaseDao {

    @Query("SELECT * FROM todo_item")
    fun getAllTodo() : Flow<List<TodoItem>>

    @Query("SELECT * FROM todo_item WHERE id = :caseId ")
    fun getCaseById(caseId : Long) : LiveData<TodoItem>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(itemTodo : TodoItem)

    @Query("DELETE FROM todo_item WHERE id = :caseId")
    suspend fun deleteTodo(caseId : Long)

    @Update
    suspend fun updateTodo(caseItem : TodoItem?)

}