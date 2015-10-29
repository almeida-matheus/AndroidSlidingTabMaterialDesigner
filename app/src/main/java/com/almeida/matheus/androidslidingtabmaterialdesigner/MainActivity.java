package com.almeida.matheus.androidslidingtabmaterialdesigner;


import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.almeida.matheus.androidslidingtabmaterialdesigner.Adapters.TabsAdapter;
import com.almeida.matheus.androidslidingtabmaterialdesigner.Components.SlidingTabLayout;

public class MainActivity extends ActionBarActivity {

    Toolbar mToolbar;
    ViewPager mViewPager;
    TabsAdapter mTabsAdapter;
    SlidingTabLayout mSlidingTabLayout;
    int icons [] = {R.drawable.ic_mode_comment_white_24dp, R.drawable.ic_favorite_black_24dp
                    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);

        mTabsAdapter =  new TabsAdapter(getSupportFragmentManager(), icons);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mTabsAdapter);

        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.tabs);
        mSlidingTabLayout.setDistributeEvenly(true);

        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        mSlidingTabLayout.setViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
