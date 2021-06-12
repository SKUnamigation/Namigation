package com.example.Namigation.FragTabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Product_ViewPagerAdapter extends FragmentPagerAdapter {
    public Product_ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    // 호출되면서 Frament 교체를 보여주는 처리를 구현
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return FragShampoo.newinstance();
            case 1:
                return FragTorner.newinstance();
            case 2:
                return FragDevice.newinstance();
            default:
                return null;
        }
    }

    // 개수를 명시 해줘야함.
    @Override
    public int getCount() {
        return 3;
    }

    // 상단의 tablayout indicator 쪽에 선언을 해주는 것.
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "샴푸";
            case 1:
                return "토너";
            case 2:
                return "기기";
            default:
                return null;
        }
    }
}
