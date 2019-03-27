package com.tashad16a.gmail.hw1403recyclerview.recyclerview

import android.graphics.Color
import android.support.annotation.NonNull
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.tashad16a.gmail.hw1403recyclerview.itemtouch.ItemTouchHelperAdapter
import com.tashad16a.gmail.hw1403recyclerview.R
import java.util.Collections

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>,
    ItemTouchHelperAdapter {

    var students: MutableList<Student> = ArrayList()
    lateinit var studentView: View

    constructor(students: MutableList<Student>) : super() {
        this.students = students
    }

    override fun onCreateViewHolder(@NonNull viewGroup: ViewGroup, viewType: Int): ViewHolder {
        studentView = LayoutInflater.from(viewGroup.context).inflate(R.layout.layout_student, viewGroup, false)

        return ViewHolder(studentView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        var student = students[position]

        viewHolder.avatarView.setImageResource(student.avatar)
        viewHolder.nameView.text = student.name
        viewHolder.statusView.text = student.status
    }

    override fun getItemCount(): Int {
        return students.size
    }

    class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        val avatarView: ImageView
        val nameView: TextView
        val statusView: TextView

        init {
            avatarView = view.findViewById<View>(R.id.avatar_imageView) as ImageView
            nameView = view.findViewById<View>(R.id.name_textView) as TextView
            statusView = view.findViewById<View>(R.id.status_textView) as TextView
        }
    }

    override fun onItemMove(fromPosition: Int, toPosition: Int) {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(students, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1) {
                Collections.swap(students, i, i - 1)
            }
        }

        notifyItemMoved(fromPosition, toPosition)
    }

    override fun onItemRemove(position: Int) {
        students.removeAt(position)
        notifyItemRemoved(position)
    }

    override fun onItemSelected() {
        studentView.setBackgroundColor(Color.LTGRAY)
    }

    override fun onItemClear() {
        studentView.setBackgroundColor(0)
    }
}