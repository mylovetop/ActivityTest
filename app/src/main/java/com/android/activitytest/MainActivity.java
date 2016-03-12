package com.android.activitytest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.activitytest.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.btn_main_back)).setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_main_back:
                finish();
                break;
        }
    }


}
