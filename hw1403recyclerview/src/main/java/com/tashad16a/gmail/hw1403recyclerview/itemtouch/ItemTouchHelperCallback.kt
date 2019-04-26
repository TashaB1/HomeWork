package com.tashad16a.gmail.hw1403recyclerview.itemtouch

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

class ItemTouchHelperCallback : ItemTouchHelper.Callback {

    val helperAdapter: ItemTouchHelperAdapter

    constructor(itemTouchHelperAdapter: ItemTouchHelperAdapter) : super() {
        helperAdapter = itemTouchHelperAdapter
    }

    override fun isLongPressDragEnabled(): Boolean {
        return true
    }

    override fun isItemViewSwipeEnabled(): Boolean {
        return true
    }

    override fun getMovementFlags(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder): Int {
        val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
        val swipeFlags = ItemTouchHelper.START or ItemTouchHelper.END

        return makeMovementFlags(dragFlags, swipeFlags)
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {

        helperAdapter.onItemMove(viewHolder.adapterPosition, target.adapterPosition)

        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, position: Int) {
        helperAdapter.onItemRemove(viewHolder.adapterPosition)
    }
}