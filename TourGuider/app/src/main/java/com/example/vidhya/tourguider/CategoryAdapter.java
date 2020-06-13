package com.example.vidhya.tourguider;

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
            return new MunnarFragment();
        } else if (position == 1) {
            return new MysuruFragment();
        } else if (position == 2) {
            return new TranquebarFragment();
        } else {
            return new TrichyFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_Munnar);
        } else if (position == 1) {
            return mContext.getString(R.string.category_Mysuru);
        } else if (position == 2) {
            return mContext.getString(R.string.category_Tranquebar);
        } else {
            return mContext.getString(R.string.category_Trichy);
        }
    }
}
