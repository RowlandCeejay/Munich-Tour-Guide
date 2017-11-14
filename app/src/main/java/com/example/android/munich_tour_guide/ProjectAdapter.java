package com.example.android.munich_tour_guide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ProjectAdapter extends FragmentPagerAdapter {

    private Context iContext;


    public ProjectAdapter(Context context, FragmentManager fm) {
        super(fm);
        iContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new IndustryFragment();
        } else {
            return new CulturalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return iContext.getString(R.string.category_landmarks);
        } else if (position == 1) {
            return iContext.getString(R.string.category_hotels);
        } else if (position == 2) {
            return iContext.getString(R.string.category_industry);
        } else {

            return iContext.getString(R.string.category_culture);
        }
    }
}
