package com.tashad16a.gmail.hw0403services.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.tashad16a.gmail.hw0403services.R

class LessonSelectionFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        lateinit var selectionView: View

        selectionView = inflater.inflate(R.layout.fragment_lesson_selection, container, false)

        val button1 = selectionView.findViewById(R.id.lesson1_button) as Button
        val button2 = selectionView.findViewById(R.id.lesson2_button) as Button
        val button3 = selectionView.findViewById(R.id.lesson3_button) as Button
        val button4 = selectionView.findViewById(R.id.lesson4_button) as Button
        val button5 = selectionView.findViewById(R.id.lesson5_button) as Button
        val button6 = selectionView.findViewById(R.id.lesson6_button) as Button

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)

        return selectionView
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }

    override fun setRetainInstance(retain: Boolean) {
        super.setRetainInstance(retain)
    }

    fun getButtonIndex(i: Int): Int {
        var index = -1
        when (i) {
            R.id.lesson1_button -> index = 1
            R.id.lesson2_button -> index = 2
            R.id.lesson3_button -> index = 3
            R.id.lesson4_button -> index = 4
            R.id.lesson5_button -> index = 5
            R.id.lesson6_button -> index = 6
        }
        return index
    }

    interface OnSelectedButtonListener {
        fun onButtonSelected(buttonIndex: Int)
    }

    override fun onClick(v: View?) {
        var buttonIndex = getButtonIndex(v?.id!!)

        val listener = activity as OnSelectedButtonListener?
        listener!!.onButtonSelected(buttonIndex)
    }


}