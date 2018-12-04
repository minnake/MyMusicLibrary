package com.example.keinonen.library;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LibraryFragment();
        } else if (position == 1) {
            return new PlayFragment();
        } else {
            return new ShopFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_library);
        } else if (position == 1) {
            return mContext.getString(R.string.category_play);
        } else {
            return mContext.getString(R.string.category_shop);
        }
    }
}
