package com.example.listcase.view.case_list

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.listcase.MainCoroutine
import com.example.listcase.domain.extities.CaseImportance
import com.example.listcase.getOrAwaitValueTest
import com.example.listcase.repository.FakeCaseRepository
import com.example.listcase.utils.Status
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test


@ExperimentalCoroutinesApi
class DetailsCaseViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutine()

    private lateinit var viewModel : DetailsViewModel

    @Before
    fun setup() {
        viewModel = DetailsViewModel(FakeCaseRepository())
    }

    //todo Закончить тест
    @Test
    fun `insert case item with empty field , returns error`() {
        viewModel.insertCaseItem("",CaseImportance.NORMAL)

        val value = viewModel.insertCaseItemStatus.getOrAwaitValueTest()

        assertThat(value.getContentIfNotHandled()?.status).isEqualTo(Status.ERROR)

    }

}