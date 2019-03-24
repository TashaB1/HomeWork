package com.tashad16a.gmail.hw1103compaundviewnavigationdrawer.fragment

import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.tashad16a.gmail.hw1103compaundviewnavigationdrawer.R

class CompoundPageFragment : LinearLayout {
    companion object {
        lateinit var fragmentText: TextView
    }

    constructor(context: Context?) : super(context) {
        initializeView()
    }

    constructor(context: Context?, @Nullable attrs: AttributeSet?) : super(context, attrs) {
        initializeView()
    }

    constructor(context: Context?, @Nullable attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initializeView()
    }

    fun initializeView() {
        LinearLayout.inflate(
            context,
            R.layout.view_fragment_page, this
        )

        fragmentText = findViewById(R.id.nd_fragment_page_textView)
    }
}