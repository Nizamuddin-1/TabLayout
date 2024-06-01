package com.example.tablayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
ViewPager v;
TabLayout t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=findViewById(R.id.view);
        t=findViewById(R.id.tab);
        ViewPagerManager adapter =new ViewPagerManager(getSupportFragmentManager());
        v.setAdapter(adapter);
        t.setupWithViewPager(v);
    }
}