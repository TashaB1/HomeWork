package com.tashad16a.gmail.hw1103compaundviewnavigationdrawer.fragment

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tashad16a.gmail.hw1103compaundviewnavigationdrawer.R
import org.jetbrains.annotations.NotNull

class PageFragment : Fragment() {

    @Nullable
    override fun onCreateView(
        @NotNull inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }
}