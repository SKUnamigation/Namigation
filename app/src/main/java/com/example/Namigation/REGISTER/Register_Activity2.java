package com.example.Namigation.REGISTER;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Namigation.LOGIN.LoginActivity;
import com.example.Namigation.R;

import java.util.Calendar;
import java.util.Random;

public class Register_Activity2 extends AppCompatActivity {
    Button Register_Success_Btn;

    private static String TAG = "phptest";
    private static String IP_ADDRESS = "";

    RadioButton female, male;
    RadioGroup sexRG;

    DatePicker DP_age;

    View dialogView;

    private int Year, Month, Day;

    String name, id, pw, gender, age;

    int userNum, RB_selected;
    Random random = new Random();
    int maxNum = 9999;
    int minNum = 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity2);

        female = (RadioButton) findViewById(R.id.femaleBtn);
        male = (RadioButton) findViewById(R.id.maleBtn);
        sexRG = (RadioGroup) findViewById(R.id.sexRG);

        Year = Calendar.getInstance().get(Calendar.YEAR);
        Month = Calendar.getInstance().get(Calendar.MONTH);
        Day= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        DP_age = (DatePicker) findViewById(R.id.DPage);
        DP_age.init(Year, Month, Day, new DatePicker.OnDateChangedListener(){
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                age = Integer.toString(year) + "-" + Integer.toString((monthOfYear + 1)) + "-" + Integer.toString(dayOfMonth);
            }
        });

        Register_Success_Btn = (Button) findViewById(R.id.Register_Success_Btn);

        // RegisterActivity1에서 입력된 값 받아오기.
        name = getIntent().getStringExtra("name_Intent");
        id = getIntent().getStringExtra("id_Intent");
        pw = getIntent().getStringExtra("pw_Intent");

        Register_Success_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                GetData task = new GetData();
//                task.execute("http://" + IP_ADDRESS + "/Register_SuccessBtn.php", "");

                RB_selected = sexRG.getCheckedRadioButtonId();

                if (RB_selected == -1) {
                    Toast.makeText(getApplicationContext(), "성별을 선택하세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    final RadioButton rb = (RadioButton) findViewById(RB_selected);
                    gender = rb.getText().toString();

                    userNum = random.nextInt(maxNum - minNum + 1) + minNum;

                    ContentValues contentValues = new ContentValues();
                    contentValues.put("usernumber", String.valueOf(userNum));
                    contentValues.put("name", name);
                    contentValues.put("id", id);
                    contentValues.put("pw", pw);
                    contentValues.put("gender", gender);
                    contentValues.put("age", age);

                    HttpUtil networkTask = new HttpUtil(IP_ADDRESS, contentValues);
                    networkTask.execute();
                }

            }
        });


    }

    private class HttpUtil extends AsyncTask<Void, Void, String> {

        String IP_ADDRESS;
        ContentValues contentValues;

        public HttpUtil(String IP_ADDRESS, ContentValues contentValues) {
            this.IP_ADDRESS = IP_ADDRESS;
            this.contentValues = contentValues;
        }

        /**
         * onPostExcute()의 파라미터로 return 값이 전달됨.
         * */
        @Override
        protected String doInBackground(Void... params) {
            RequestHttpURLConnection requestHttpURLConnection = new RequestHttpURLConnection();
            String result = requestHttpURLConnection.postRequest(IP_ADDRESS, contentValues);
            return result;
        }

        /**
         * Progress Bar 동작
        * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /**
         * 결과에 따른 UI 수정
        * */
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            dialogView = (View) View.inflate(Register_Activity2.this, R.layout.alertdialog_activity, null);

            AlertDialog.Builder dlg = new AlertDialog.Builder(Register_Activity2.this);
            dlg.setTitle(name + "님 환영합니다.\n").setMessage("회원님의 회원번호는 " + userNum + "입니다.");
            dlg.setView(dialogView);

            // alertDialog 확인 버튼 클릭시 클릭 이벤트 발생
            dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Register_Activity2.this, "가입이 완료되었습니다. 로그인을 해주세요.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register_Activity2.this, LoginActivity.class);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = dlg.create();
            alertDialog.show();
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            Toast.makeText(getApplicationContext(),"회원 등록에 실패하였습니다.",Toast.LENGTH_SHORT).show();

        }
    }
}
