package com.tashad16a.gmail.hw1403recyclerview.itemtouch

interface ItemTouchHelperAdapter {
    fun onItemMove(fromPosition: Int, toPosition: Int)

    fun onItemRemove(position: Int)
}