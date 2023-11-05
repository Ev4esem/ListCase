package com.example.listcase.domain

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.asLiveData
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.listcase.domain.extities.CaseImportance
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.getOrAwaitValue
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class CaseDaoTest {

    @get:Rule
    var instantTestExecutorRule = InstantTaskExecutorRule()


    private lateinit var dataBase : MainDataBase
    private lateinit var dao : CaseDao

    @Before
    fun setup() {
        dataBase = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            MainDataBase::class.java
        ).allowMainThreadQueries().build()
        dao = dataBase.getDao()
    }

    @After
    fun teardown() {
        dataBase.close()
    }

        @Test
        fun insertCaseItem() = runBlockingTest {

            val caseItem = TodoItem(id = 1,"name",false,"00:00:00",CaseImportance.NORMAL)
            dao.insertTodo(caseItem)

            val allCaseItems = dao.getAllTodo().asLiveData().getOrAwaitValue()

            assertThat(allCaseItems).contains(caseItem)
    }

    @Test
    fun deleteCaseItem() = runBlockingTest {
        val caseItem = TodoItem(id = 1,"name",false,"00:00:00",CaseImportance.NORMAL)
        dao.insertTodo(caseItem)
        dao.deleteTodo(caseItem.id)

        val allCaseItems = dao.getAllTodo().asLiveData().getOrAwaitValue()

        assertThat(allCaseItems).doesNotContain(caseItem)
    }

    @Test
    fun updateCaseItem() = runBlockingTest {
        val caseItem = TodoItem(id = 1,"name",false,"00:00:00",CaseImportance.NORMAL)
        val caseItem2 = TodoItem(id = 1,"Rashid",false,"13:00:00",CaseImportance.HIGH)
        dao.insertTodo(caseItem)
        dao.updateTodo(caseItem2)

        val allCaseItems = dao.getAllTodo().asLiveData().getOrAwaitValue()

        assertThat(allCaseItems).contains(caseItem2)

    }

    fun getCaseById() = runBlockingTest {
        val caseItem = TodoItem(id = 1,"name",false,"00:00:00",CaseImportance.NORMAL)
        dao.insertTodo(caseItem)
        dao.getCaseById(caseItem.id)


        val allCaseItems = dao.getAllTodo().asLiveData().getOrAwaitValue()

        val assertThat = assertThat(allCaseItems).contains(caseItem.id)
        println("$assertThat")

    }

}