package com.example.Namigation.RESULT;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.example.Namigation.R;

public class Detail_Result extends AppCompatActivity implements CircleProgressBar.ProgressFormatter{

    private static final String DEFAULT_PATTERN = "%d%%";

    CircleProgressBar circleProgressBar;
    String Total_ProgressRate, Dangerous_Text;
    Intent intent;

    TextView Dan_grade;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_result);

        intent = getIntent();

        // 총 점수
        Total_ProgressRate = intent.getStringExtra("Total_ProgressRate");
        // 위험도
        Dangerous_Text = intent.getStringExtra("Dangerous");

        // 원형 프로그레스 바
        circleProgressBar = (CircleProgressBar) findViewById(R.id.result_graph);

        // 위험도 텍스트 뷰
        Dan_grade = (TextView) findViewById(R.id.Dan_grade);

        // 원형 프로그레스 바 최대치 설정
        circleProgressBar.setMax(100);
        int graph_max = circleProgressBar.getMax();

        // 원형 프로그레스 바 게이지 채워주기
        circleProgressBar.setProgress(Integer.parseInt(Total_ProgressRate));
        int graph_progress = circleProgressBar.getProgress();

        // 위험도 텍스트 설정
        Dan_grade.setText(Dangerous_Text);

        // 위험도 종류에 따른 텍스트 color 설정
        if (Dangerous_Text.equals("고위험"))   {
            Dan_grade.setTextColor(Color.RED);
        } else if (Dangerous_Text.equals("위험")){
            Dan_grade.setTextColor(Color.parseColor("#ff860d"));
        } else if (Dangerous_Text.equals("경고")){
            Dan_grade.setTextColor(Color.parseColor("#de6847"));
        } else if (Dangerous_Text.equals("좋음")){
            Dan_grade.setTextColor(Color.parseColor("#75e078"));
        }

    }

    @Override
    public CharSequence format(int progress, int max) {
        return String.format(DEFAULT_PATTERN, (int) ((float) progress / (float) max * 100));
    }
}
