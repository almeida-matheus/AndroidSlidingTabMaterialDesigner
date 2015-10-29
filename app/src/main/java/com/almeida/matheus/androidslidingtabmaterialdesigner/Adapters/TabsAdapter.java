package com.almeida.matheus.androidslidingtabmaterialdesigner.Adapters;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.almeida.matheus.androidslidingtabmaterialdesigner.Tabs.OneTab;
import com.almeida.matheus.androidslidingtabmaterialdesigner.Tabs.TwoTab;
import com.astuetz.PagerSlidingTabStrip;

public class TabsAdapter extends FragmentStatePagerAdapter implements PagerSlidingTabStrip.IconTabProvider {

    int icons[];

    public TabsAdapter(FragmentManager fm, int mIcons[]) {
        super(fm);
        this.icons = mIcons;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0)
        {
            OneTab tab1 = new OneTab();
            return tab1;
        }
        else
        {
            TwoTab tab2 = new TwoTab();
            return tab2;
        }

    }

   @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public int getPageIconResId(int position) {
        return icons[position];
    }
}