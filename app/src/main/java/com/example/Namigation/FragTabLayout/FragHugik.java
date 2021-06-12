package com.example.Namigation.FragTabLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.Namigation.R;

public class FragHugik extends Fragment {

    private View view;

    public static FragHugik newinstance() {
        FragHugik fragHugik = new FragHugik();
        return fragHugik;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_hujik_info, container, false);

        return view;

    }
}
