package com.tashad16a.gmail.hw0603ui.uigooglepodcasts.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tashad16a.gmail.hw0603_ui.R;

public class SimplePageFragment extends Fragment {

    private static String PAGE_NAME_KEY = "com.tashad16a.gmail.hw0603ui.uigooglepodcasts.fragment.PAGE_NAME_KEY";

    public static Fragment newInstance(final String pPageName) {
        final Bundle arguments = new Bundle();
        final SimplePageFragment fragment = new SimplePageFragment();

        arguments.putString(PAGE_NAME_KEY, pPageName);
        fragment.setArguments(arguments);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final Bundle arguments = getArguments();
        final View fragmentView = inflater.inflate(R.layout.layout_pg_for_you_fragment2, container, false);

        if (arguments != null && arguments.containsKey(PAGE_NAME_KEY)) {
            ((TextView) fragmentView.findViewById(R.id.pg_fragment_page_textView)).setText(arguments.getString(PAGE_NAME_KEY));
        }

        return fragmentView;
    }
}
