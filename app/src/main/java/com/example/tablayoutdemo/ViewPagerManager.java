package com.example.tablayoutdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerManager extends FragmentPagerAdapter {
    public ViewPagerManager(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
         if(position==0)
         {
             return new ChatsFragment();
         }
         else if(position==1)
         {
             return new StatusFragment();
         }
         else
         {
             return  new CallsFragment();
         }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Nizam";
        }
        else if(position==1)
        {
            return "Status";
        }
        else
        {
            return "Calls";
        }
    }
}
