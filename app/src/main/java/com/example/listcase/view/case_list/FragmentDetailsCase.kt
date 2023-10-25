package com.example.listcase.view.case_list

import android.annotation.SuppressLint
import android.icu.util.Calendar
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TimePicker
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.listcase.R
import com.example.listcase.databinding.FragmentDetailsCaseBinding
import com.example.listcase.domain.ImportanceProvider
import com.example.listcase.domain.extities.CaseImportance
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.view.base.BaseFragment
import com.example.listcase.utils.dialogs.TimePickerFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentDetailsCase() :
    BaseFragment(R.layout.fragment_details_case),
    TimePickerFragment.TimePickerCallback,
    ImportanceProvider {


    private var caseId : Long? = null
    private lateinit var binding : FragmentDetailsCaseBinding
    override val viewModel by viewModels<DetailsViewModel>()


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            caseId = it.getLong(CASE_ID)
        }
    }

    @SuppressLint("SuspiciousIndentation", "ResourceAsColor")
    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailsCaseBinding.bind(view)

        deleteActivated()
        observe()
        binding.tvSave.setOnClickListener {

            if (caseId != null) {
                    val updatedCaseItem = createTodoItemWithoutId()
                    viewModel.updateListItem(updatedCaseItem)
                } else {
                    val newCaseItem = createTodoItemWithoutId()
                newCaseItem?.let { it1 -> viewModel.insertCaseItemIntoDb(it1) }
                }

            findNavController().popBackStack()
        }
        binding.swTime.setOnClickListener {
            showTimePickerDialog()
        }
        binding.imBackStack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.imDelete.setOnClickListener {
            if (caseId != null) {
                viewModel.deleteCaseItem(caseId!!)
                findNavController().popBackStack()
            }
        }
        binding.tvDelete.setOnClickListener {
            if (caseId != null) {
                viewModel.deleteCaseItem(caseId!!)
                findNavController().popBackStack()
            }
        }
    }

    private fun observe() {
        val caseLiveData = caseId?.let { viewModel.getCaseById(it) }
        caseLiveData?.observe(viewLifecycleOwner) {
            binding.edDesc.setText(it.name)
            binding.tvTime.text = it.time
        }
    }
    private fun deleteActivated() {
        val redColor = ContextCompat.getColor(requireContext(), R.color.red)
        val grayColor = ContextCompat.getColor(requireContext(), R.color.gray)
        val crashImage = ContextCompat.getDrawable(requireContext(),R.drawable.crash_image_gray)
        if (caseId != null) {
            binding.imDelete.isClickable = true
            binding.tvDelete.isClickable = true
            binding.tvDelete.setTextColor(redColor)
        } else {
            binding.imDelete.isClickable = false
            binding.tvDelete.isClickable = false
            binding.imDelete.setImageDrawable(crashImage)
            binding.tvDelete.setTextColor(grayColor)
        }
    }
    private fun createTodoItemWithoutId() : TodoItem? {
        val title = binding.edDesc.text.toString().trim()
        if (title.isEmpty()) {
            Toast.makeText(requireContext(),"Название дела не может быть пустым",Toast.LENGTH_LONG).show()
            return null
        }
        val time = binding.tvTime.text.toString().takeIf { it.isNotEmpty() } ?: "No time"
        val importance = getSelectedImportance()

        return TodoItem(caseId ?: 0,title,false,time,importance)
    }

   private fun showTimePickerDialog() {
       val calendar = Calendar.getInstance()
       val timePickerDialog = TimePickerFragment(
           requireContext(),
           this,
           calendar
       )
       timePickerDialog.show()
   }

    override fun onTimeSelected(view : TimePicker?, hourOfDay : Int, minute : Int) {

        val formattedTime = String.format("%02d:%02d",hourOfDay,minute)
        binding.tvTime.text = formattedTime
        Log.d("FRAGMENT_TIME"," Selected time in fragment: $hourOfDay:$minute")
        binding.tvTime.visibility = View.VISIBLE

    }

    override fun getSelectedImportance() : CaseImportance {
        val selectedImportance = binding.spinImportance.selectedItemPosition
        return when(selectedImportance) {
            0 -> CaseImportance.NORMAL
            2 -> CaseImportance.LOW
            1 -> CaseImportance.HIGH
            else -> CaseImportance.NORMAL
        }
    }

    companion object {
         const val CASE_ID = "CASE_ID"
    }

}