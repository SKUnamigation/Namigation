package com.example.Namigation.HOME;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.Namigation.R;

public class Dialog_info extends Dialog implements View.OnClickListener{
    private Context mContext;

    private TextView btn_confirm;



    public Dialog_info(@NonNull Context context) {

        super(context);

        mContext = context;

    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_info);

        btn_confirm = (TextView) findViewById(R.id.dialog_button_confirm);

        btn_confirm.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dialog_button_confirm:
                dismiss();
                break;
        }
    }
}
