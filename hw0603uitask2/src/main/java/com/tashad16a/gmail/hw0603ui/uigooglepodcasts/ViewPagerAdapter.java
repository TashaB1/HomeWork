package com.tashad16a.gmail.hw0603ui.uigooglepodcasts;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.tashad16a.gmail.hw0603_ui.R;
import com.tashad16a.gmail.hw0603ui.uigooglepodcasts.fragment.PageFragment;
import com.tashad16a.gmail.hw0603ui.uigooglepodcasts.fragment.SimplePageFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    PageFragment pageFragment = new PageFragment();

    public ViewPagerAdapter(Context context, final FragmentManager fragmentManager) {
        super(fragmentManager);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return pageFragment;
        } else {
            return SimplePageFragment.newInstance((String) getPageTitle(position));
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.gp_tab_new_episodes);
            case 1:
                return mContext.getString(R.string.gp_tab_in_progress);
            case 2:
                return mContext.getString(R.string.gp_tab_downloads);
            default:
                return null;
        }
    }
}