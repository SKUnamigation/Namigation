package com.example.Namigation.HOME;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.Namigation.FragTabLayout.HairLoss_Information;
import com.example.Namigation.FragTabLayout.HairLoss_Product;
import com.example.Namigation.R;
import com.example.Namigation.RESULT.Result_Diary;
import com.makeramen.roundedimageview.RoundedImageView;

public class Home_Fragment extends Fragment {
    ViewGroup viewGroup;

    String id;

    RoundedImageView Information, Clinic, Diary;
    Button Result, CreateQR;

    Button Product;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.home_fragment, container, false);


        Product = (Button) viewGroup.findViewById(R.id.hairloss_product);

        Information = (RoundedImageView) viewGroup.findViewById(R.id.Information);
        Clinic = (RoundedImageView) viewGroup.findViewById(R.id.Clinic);
        Diary = (RoundedImageView) viewGroup.findViewById(R.id.Diary);
        Result = (Button) viewGroup.findViewById(R.id.result_Btn);
        CreateQR = (Button) viewGroup.findViewById(R.id.CreateQR_Btn);

        Bundle bundle = getArguments();

        id = bundle.getString("id");


        // 홈 화면에서 각 버튼을 클릭했을 때의 동작을 작성. -> 액티비티 이동
        Product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HairLoss_Product.class);
                startActivity(intent);
            }
        });

        CreateQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreateQR.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });

        Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HairLoss_Information.class);
                startActivity(intent);
            }
        });

        Clinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
                startActivity(intent);
            }
        });

        Diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Inconvenience_Sending.class);
                startActivity(intent);
            }
        });

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Result_Diary.class);
                intent.putExtra("id", id);

                startActivity(intent);
            }
        });

        return viewGroup;
    }
}
