package com.example.smart_mirror.HOME;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.smart_mirror.BOARD.FreeBoard_Activity;
import com.example.smart_mirror.RESULT.HairLoss_Result;
import com.example.smart_mirror.MYPAGE.MyPage_Activity;
import com.example.smart_mirror.MAP.Maps_HairLoss_Clinic_Activity;
import com.example.smart_mirror.R;
import com.example.smart_mirror.RESULT.Smile_Activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Fragment extends Fragment {
    ViewGroup viewGroup;

    String id;

    Button Hair_Loss;
    Button Smile;
    Button Clinic;
    Button FreeBoard;
    Button MyPage;

    ImageView iv_Img1;
    ImageView iv_Img2;
    ImageView iv_Img3;

    BottomNavigationView bottomNavigationView;

    Home_Fragment home_Fragment;

    ViewFlipper viewFlipper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.home_fragment, container, false);

        viewFlipper = (ViewFlipper) viewGroup.findViewById(R.id.viewF);

        iv_Img1 = (ImageView) viewGroup.findViewById(R.id.iv_img1);
        iv_Img2 = (ImageView) viewGroup.findViewById(R.id.iv_img2);
        iv_Img3 = (ImageView) viewGroup.findViewById(R.id.iv_img3);

        Hair_Loss = (Button) viewGroup.findViewById(R.id.HairLoss);
        Smile = (Button) viewGroup.findViewById(R.id.Smile);
        Clinic = (Button) viewGroup.findViewById(R.id.Hospital);
        FreeBoard = (Button) viewGroup.findViewById(R.id.freeBoard);
        MyPage = (Button) viewGroup.findViewById(R.id.Home_MyPage);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);

        Bundle bundle = getArguments();

        id = bundle.getString("id");


        // 홈 화면에서 각 버튼을 클릭했을 때의 동작을 작성. -> 액티비티 이동
        Hair_Loss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HairLoss_Result.class);
                startActivity(intent);
            }
        });
        Smile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Smile_Activity.class);
                startActivity(intent);
            }
        });
        Clinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Maps_HairLoss_Clinic_Activity.class);
                startActivity(intent);
            }
        });
        FreeBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FreeBoard_Activity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
        MyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyPage_Activity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });


        return viewGroup;
    }
}
