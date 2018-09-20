package com.example.android.touristguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by El.masry on 04/02/2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    SimpleFragmentPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext=context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new PlacesFragment();
        }else if (position==1){
            return new RestaurentsFragment();
        }else if (position==2){
            return new ShoppingFragment();
        }else {
            return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return mContext.getString(R.string.places);
        }else if (position==1){
            return mContext.getString(R.string.restaurants);
        }else if (position==2){
            return mContext.getString(R.string.shopping);
        }else {
            return mContext.getString(R.string.events);
        }
    }
}

