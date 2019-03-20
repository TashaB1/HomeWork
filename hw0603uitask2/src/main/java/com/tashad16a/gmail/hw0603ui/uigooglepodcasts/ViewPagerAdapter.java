package com.tashad16a.gmail.hw0603ui.uigooglepodcasts;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.tashad16a.gmail.hw0603_ui.R;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PageFragment();
        } else if (position == 1) {
            return new PageFragment();
        } else {
            return new PageFragment();
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