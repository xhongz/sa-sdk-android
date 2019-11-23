package com.sensorsdata.analytics.android.demo.activity;

import android.app.Fragment;
import android.os.Bundle;

import androidx.legacy.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.sensorsdata.analytics.android.demo.R;
import com.sensorsdata.analytics.android.demo.fragment.BaseAppFragment;
import com.sensorsdata.analytics.android.demo.fragment.app.Frg_app_1;
import com.sensorsdata.analytics.android.demo.fragment.app.Frg_app_2;
import com.sensorsdata.analytics.android.demo.fragment.app.Frg_app_3;

import java.util.ArrayList;
import java.util.List;

/**
 * ViewPager + android.app.Fragment
 * 展示 Frg_app_1、Frg_app_2、Frg_app_3
 */
public class VPAppFrgActivity extends BaseActivity {

    private List<BaseAppFragment> listPagerViews = null;
    private FragmentPagerAdapter pagerAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vpapp_frg);
        this.setTitle("ViewPager + app.Fragment");
        initViewPager();
    }

    private void initViewPager() {
        listPagerViews = new ArrayList<>();

        listPagerViews.add(new Frg_app_1());
        listPagerViews.add(new Frg_app_2());
        listPagerViews.add(new Frg_app_3());
        ViewPager viewPager = findViewById(R.id.vp_app_frg);
        pagerAdapter = new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public int getCount() {
                return listPagerViews.size();
            }

            @Override
            public Fragment getItem(int i) {
                return listPagerViews.get(i);
            }
        };
        viewPager.setAdapter(pagerAdapter);
    }
}
