package com.example.listcase.utils

import android.content.Context
import android.graphics.Canvas
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.listcase.R
import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator


abstract class SwipeToDeleteCallbacks(context : Context)
    : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

    private val deleteColor = ContextCompat.getColor(context,R.color.red)
    private val deleteIcon = R.drawable.delete

    override fun onMove(
        recyclerView : RecyclerView,
        viewHolder : RecyclerView.ViewHolder,
        target : RecyclerView.ViewHolder
    ) : Boolean {
        return false
    }


    override fun onChildDraw(
        c : Canvas,
        recyclerView : RecyclerView,
        viewHolder : RecyclerView.ViewHolder,
        dX : Float,
        dY : Float,
        actionState : Int,
        isCurrentlyActive : Boolean
    ) {

        RecyclerViewSwipeDecorator.Builder(
            c,
            recyclerView,
            viewHolder,
            dX,
            dY,
            actionState,
            isCurrentlyActive
        )
            .addSwipeLeftBackgroundColor(deleteColor)
            .addSwipeLeftActionIcon(deleteIcon)
            .addSwipeRightBackgroundColor(deleteColor)
            .addSwipeRightActionIcon(deleteIcon)
            .create()
            .decorate()

        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
    }
}
