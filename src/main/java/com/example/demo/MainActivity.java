package com.example.demo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


import java.util.ArrayList;

import adapter.MyVpFragmentAdapter;
import fragment.Fragment_A;
import fragment.Fragment_B;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mVp;
    private TabLayout mTl;
    private ArrayList<Fragment> list;
    private MyVpFragmentAdapter adapter;
    private NavigationView mNv;
    private Toolbar mTb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//张苗苗
        initView();
        initToolBar();
        initFragment();
        initTab();
    }

    private void initToolBar() {
        mTb.setTitle("首页");
        mNv.setItemIconTintList(null);
    }

    private void initTab() {
        mTl.setupWithViewPager(mVp);
        mTl.getTabAt(0).setText("资讯");
        mTl.getTabAt(1).setText("我的收藏");
        mTl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0){
                    mTb.setTitle("首页");
                }else {
                    mTb.setTitle("我的收藏");
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initFragment() {
        list = new ArrayList<>();
        list.add(new Fragment_A());
        list.add(new Fragment_B());
        adapter = new MyVpFragmentAdapter(getSupportFragmentManager(), list);
        mVp.setAdapter(adapter);

        View headerView = mNv.getHeaderView(0);
        final ImageView header_img = headerView.findViewById(R.id.header_img);
        header_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                header_img.setImageResource(R.drawable.select);
            }
        });
    }

    private void initView() {
        mVp = (ViewPager) findViewById(R.id.vp);
        mTl = (TabLayout) findViewById(R.id.tl);
        mVp.setOnClickListener(this);
        mTl.setOnClickListener(this);
        mNv = (NavigationView) findViewById(R.id.nv);
        mTb = (Toolbar) findViewById(R.id.tb);
        mNv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.vp:
                break;
            case R.id.tl:
                break;
            case R.id.nv:
                break;
        }
    }
}
