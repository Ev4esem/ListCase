package com.example.listcase.view.case_list

import android.annotation.SuppressLint
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.listcase.R
import com.example.listcase.databinding.ItemCaseBinding
import com.example.listcase.domain.extities.CaseImportance
import com.example.listcase.domain.extities.TodoItem

class CaseListAdapter(private val listener : Listener) :
    ListAdapter<TodoItem, CaseListAdapter.CaseViewHolder>(CaseComporator()) {

    fun delete(position : Int) {
        val item = getItem(position)
        listener.delete(item.id)
    }

    class CaseComporator : DiffUtil.ItemCallback<TodoItem>(),Comparator<TodoItem> {

        override fun areItemsTheSame(oldItem : TodoItem, newItem : TodoItem) : Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem : TodoItem, newItem : TodoItem) : Boolean {
            return oldItem == newItem
        }

        override fun compare(p0 : TodoItem, p1 : TodoItem) : Int {
            return p0.importance.ordinal - p1.importance.ordinal
        }
    }

    class CaseViewHolder(val view : View)
        : RecyclerView.ViewHolder(view) {

        @SuppressLint("SetTextI18n")
        fun setCaseData(todoItem : TodoItem, listener : Listener) {
            val binding = ItemCaseBinding.bind(view)
            binding.apply {
                tvNameCase.text = todoItem.name

                if (todoItem.time == "00:00:00") {
                    tvData.visibility = View.GONE
                } else {
                    tvData.visibility = View.VISIBLE
                }

                tvData.text = todoItem.time
                checkBox.isChecked = todoItem.itemChecked

                checkBox.setOnClickListener {
                    listener.onClickChecked(todoItem.copy(itemChecked = checkBox.isChecked),
                        CHECK_BOX
                    )
                }
                setPaintFlagAndColor(binding)


                val checkBoxColor = when(todoItem.importance) {
                    CaseImportance.NORMAL -> R.color.gray
                    CaseImportance.LOW -> R.color.green
                    CaseImportance.HIGH -> R.color.red

                }
                checkBox.buttonTintList = ContextCompat.getColorStateList(binding.root.context,checkBoxColor)


                imDesc.setOnClickListener {
                    listener.onClick(todoItem)
                }
            }
        }

        private fun setPaintFlagAndColor(binding : ItemCaseBinding) {
            binding.apply {
                if (checkBox.isChecked) {
                    tvNameCase.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
                    tvNameCase.setTextColor(ContextCompat.getColor(binding.root.context,R.color.gray))
                } else {
                    tvNameCase.paintFlags = Paint.ANTI_ALIAS_FLAG
                    tvNameCase.setTextColor(ContextCompat.getColor(binding.root.context,R.color.black))
                }
            }
        }

        companion object {
            fun createCaseItem(parent : ViewGroup) : CaseViewHolder {
                return CaseViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_case,parent,false)
                )
            }
        }

    }


    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : CaseViewHolder {
        return CaseViewHolder.createCaseItem(parent)
    }

    override fun onBindViewHolder(holder : CaseViewHolder, position : Int) {



        holder.setCaseData(getItem(position),listener)

    }

    interface Listener {
        fun onClickChecked(todoItem : TodoItem,state : Int)
        fun delete(caseId : Long)
        fun onClick(caseId : TodoItem)
    }
    companion object{
        const val CHECK_BOX = 1

    }

}
