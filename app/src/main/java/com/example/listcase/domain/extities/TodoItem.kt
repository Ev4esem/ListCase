package com.example.listcase.domain.extities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "todo_item")
@Parcelize
data class TodoItem(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    @ColumnInfo(name = "name")
    val name : String,
    @ColumnInfo(name = "item_checked")
    val itemChecked : Boolean = false,
    @ColumnInfo(name = "time")
    val time : String,
    @ColumnInfo(name = "importance")
    val importance : CaseImportance,
) : Parcelable
