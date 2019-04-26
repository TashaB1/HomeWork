package com.tashad16a.gmail.hw1403recyclerview

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import com.tashad16a.gmail.hw1403recyclerview.itemtouch.ItemTouchHelperCallback
import com.tashad16a.gmail.hw1403recyclerview.recyclerview.DividerItemDecoration
import com.tashad16a.gmail.hw1403recyclerview.recyclerview.RecyclerViewAdapter
import com.tashad16a.gmail.hw1403recyclerview.recyclerview.Student

class MainActivity : AppCompatActivity() {

    private val PADDING_DIVIDER = 50

    var students: MutableList<Student> = ArrayList()

    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView: RecyclerView

        setContentView(R.layout.activity_main)
        setInitialData()

        recyclerView = findViewById(R.id.students_recyclerView)
        recyclerViewAdapter = RecyclerViewAdapter(students)

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                PADDING_DIVIDER
            )
        )
        recyclerView.adapter = recyclerViewAdapter

        val callback = ItemTouchHelperCallback(recyclerViewAdapter)
        val touchHelper = ItemTouchHelper(callback)
        touchHelper.attachToRecyclerView(recyclerView)
    }

    fun setInitialData() {
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student A",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student B",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student C",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student D",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student E",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student F",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student G",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student I",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student J",
                "Training in Progress"
            )
        )
        students.add(
            Student(
                R.drawable.ic_mood,
                "Student K",
                "Training in Progress"
            )
        )
    }
}
