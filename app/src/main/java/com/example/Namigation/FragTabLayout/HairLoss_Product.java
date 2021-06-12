package com.example.Namigation.FragTabLayout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.Namigation.R;
import com.google.android.material.tabs.TabLayout;

public class HairLoss_Product extends AppCompatActivity {

    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hairloss_product_detail);

        ViewPager viewPager = findViewById(R.id.product_viewpager);
        fragmentPagerAdapter = new Product_ViewPagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.product_tab_layout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
