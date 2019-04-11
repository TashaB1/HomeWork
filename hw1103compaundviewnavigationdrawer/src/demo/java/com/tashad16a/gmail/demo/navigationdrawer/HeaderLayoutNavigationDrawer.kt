package com.tashad16a.gmail.demo.navigationdrawer

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.Nullable
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.tashad16a.gmail.hw1103compaundviewnavigationdrawer.R

class HeaderLayoutNavigationDrawer : LinearLayout {

    lateinit var headerNDIcon: ImageView
    lateinit var headerNDName: TextView
    lateinit var headerNDMail: TextView
    lateinit var headerNDIconColorList: Array<String>

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

    private fun initializeView() {
        inflate(
            context,
            R.layout.view_header_layout_navigation_drawer, this
        )

        headerNDIcon = findViewById(R.id.nd_header_imageView)
        headerNDName = findViewById(R.id.nd_header_name_textView)
        headerNDMail = findViewById(R.id.nd_header_mail_textView)

        headerNDIconColorList = resources.getStringArray(R.array.header_nd_icon_color)

        headerNDIcon.setOnClickListener {
            updateHeaderNDIconColor(headerNDIconColorList[(0..9).random()])
        }
    }

    private fun updateHeaderNDIconColor(col: String) {
        val drawable = ContextCompat.getDrawable(context, R.drawable.ic_car) as Drawable
        val wrappedDrawable = DrawableCompat.wrap(drawable) as Drawable
        val color = Color.parseColor(col)

        wrappedDrawable.setTint(color)
        headerNDIcon.setImageDrawable(drawable)
    }
}