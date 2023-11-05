package com.example.listcase.domain

import com.example.listcase.domain.extities.CaseImportance

interface ImportanceProvider {

    fun getSelectedImportance() : CaseImportance

}