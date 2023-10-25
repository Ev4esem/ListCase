package com.example.listcase.view.case_list

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listcase.R
import com.example.listcase.databinding.FragmentListCaseBinding
import com.example.listcase.domain.extities.TodoItem
import com.example.listcase.utils.SwipeToDeleteCallbacks
import com.example.listcase.utils.ThemeManager
import com.example.listcase.view.base.BaseFragment
import com.example.listcase.view.case_list.FragmentDetailsCase.Companion.CASE_ID
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentListCase : BaseFragment(R.layout.fragment_list_case), CaseListAdapter.Listener {

    private lateinit var themeManager : ThemeManager
    private lateinit var binding : FragmentListCaseBinding
    private lateinit var adapter : CaseListAdapter
    private lateinit var swipeDelete : SwipeToDeleteCallbacks

    override val viewModel by viewModels<ListCaseViewModel>()


    override fun onCreate(savedInstanceState : Bundle?) {
        themeManager = ThemeManager(requireContext())
        themeManager.applyTheme(themeManager.getCurrentTheme())
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("PrivateResource")
    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListCaseBinding.bind(view)

        initSwipeToDelete()
        initRcView()
        observer()

        binding.buttonAdd.setOnClickListener {
                findNavController().navigate(R.id.fragmentDetailsCase)
        }
        binding.imSetting.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentListCase_to_settingsFragment2)
        }

    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = CaseListAdapter(this@FragmentListCase)
        rcView.adapter = adapter
    }

    private fun observer() {
        viewModel.caseListLiveData.observe(viewLifecycleOwner) {
            val sortedList = it.sortedWith(CaseListAdapter.CaseComporator())
            adapter.submitList(sortedList)
            updateCheckedItemCount(sortedList)
        }
    }
    override fun onClickChecked(todoItem : TodoItem,state : Int) {
        when(state) {
            CaseListAdapter.CHECK_BOX -> {
                viewModel.updateListItem(todoItem)
            }
        }
    }

    override fun onClick(caseId : TodoItem) {
        val itemId = caseId.id
        findNavController().navigate(
            R.id.action_fragmentListCase_to_fragmentDetailsCase,
            bundleOf(CASE_ID to itemId),
            navOptions {
                anim {
                    enter = R.anim.from_right
                    popEnter = R.anim.from_right
                    exit = R.anim.exit_right
                    popExit = R.anim.exit_right
                }
            }
        )
    }

    private fun initSwipeToDelete() {
        swipeDelete = object : SwipeToDeleteCallbacks(requireContext()) {

            override fun onSwiped(viewHolder : RecyclerView.ViewHolder, direction : Int) {

                when (direction) {

                    ItemTouchHelper.LEFT -> {
                        adapter.delete(viewHolder.bindingAdapterPosition)

                    }
                    ItemTouchHelper.RIGHT -> {
                        adapter.delete(viewHolder.bindingAdapterPosition)
                    }
                }
            }
        }
        val touchHelper = ItemTouchHelper(swipeDelete)
        touchHelper.attachToRecyclerView(binding.rcView)
    }

    @SuppressLint("SetTextI18n")
    private fun updateCheckedItemCount(todoItem : List<TodoItem>) {
        val checkedItemCount = todoItem.count { it.itemChecked }
        binding.tvCompleted.text = "Выполнено: $checkedItemCount"
    }

    override fun delete(caseId : Long) {
        viewModel.deleteCase(caseId)
    }
}