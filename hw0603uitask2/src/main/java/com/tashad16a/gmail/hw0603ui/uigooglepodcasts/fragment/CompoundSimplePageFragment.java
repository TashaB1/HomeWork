package com.tashad16a.gmail.hw0603ui.uigooglepodcasts.fragment;

import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tashad16a.gmail.hw0603_ui.R;

public class CompoundSimplePageFragment extends LinearLayout {

    public TextView fragmentText;

    public CompoundSimplePageFragment(Context context) {
        super(context);

        initializeView();
    }

    public CompoundSimplePageFragment(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        initializeView();
    }

    public CompoundSimplePageFragment(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initializeView();
    }

    private void initializeView() {
        inflate(getContext(), R.layout.view_pg_for_you_fragment2, this);

        fragmentText = findViewById(R.id.pg_fragment_page_textView);
    }
}
