package com.example.smart_mirror.HOME;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smart_mirror.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity {

    Intent intent;
    String intent_id;

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
    MyPage_Fragment myPage_fragment;



    ViewFlipper viewFlipper;

    private Boolean isPermission = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        tedPermission();

        intent = getIntent();
        intent_id = intent.getStringExtra("id");

//        viewFlipper = (ViewFlipper) findViewById(R.id.viewF);

        home_Fragment = new Home_Fragment();
        myPage_fragment = new MyPage_Fragment();

//        iv_Img1 = (ImageView) findViewById(R.id.iv_img1);
//        iv_Img2 = (ImageView) findViewById(R.id.iv_img2);
//        iv_Img3 = (ImageView) findViewById(R.id.iv_img3);
//
//        Hair_Loss = (Button) findViewById(R.id.HairLoss);
//        Smile = (Button) findViewById(R.id.Smile);
//        Clinic = (Button) findViewById(R.id.Hospital);
//        FreeBoard = (Button) findViewById(R.id.freeBoard);
//        MyPage = (Button) findViewById(R.id.Home_MyPage);

        Bundle bundle = new Bundle();
        bundle.putString("id", intent_id);
        home_Fragment.setArguments(bundle);
        myPage_fragment.setArguments(bundle);

        // 처음 Home_Activity 들어가자마자 대체되는 화면
        getSupportFragmentManager().beginTransaction().replace(R.id.container_Fragment, home_Fragment).commitAllowingStateLoss();

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_Fragment, home_Fragment).commit();

                        return true;

                    case R.id.action_board:

                        return true;

                    case R.id.action_mypage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_Fragment, myPage_fragment).commit();

                        return true;

                    default:
                        return false;
                }

            }
        });
    }

    /**
     *  권한 설정
     */
    private void tedPermission() {

        PermissionListener permissionListener = new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                // 권한 요청 성공
                isPermission = true;

            }

            @Override
            public void onPermissionDenied(ArrayList<String> deniedPermissions) {
                // 권한 요청 실패
                isPermission = false;

            }
        };

        TedPermission.with(this)
                .setPermissionListener(permissionListener)
                .setRationaleMessage(getResources().getString(R.string.permission_2))
                .setDeniedMessage(getResources().getString(R.string.permission_1))
                .setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA)
                .check();
    }
}