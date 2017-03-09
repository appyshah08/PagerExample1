package com.example.anand.pagerexample.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.anand.pagerexample.ButtonFragment;
import com.example.anand.pagerexample.ColourFragment;
import com.example.anand.pagerexample.ImageFragment;

/**
 * Created by anand on 24/02/2017.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Buttons fragment activity
                return new ButtonFragment();
            case 1:
                // Colors fragment activity
                return new ColourFragment();
            case 2:
                // Images fragment activity
                return new ImageFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
