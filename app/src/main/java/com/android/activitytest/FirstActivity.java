package com.android.activitytest;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.activitytest.base.BaseActivity;

/**
 * Created by Administrator on 2016/1/13.
 */
public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        Button btn = (Button)findViewById(R.id.button_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "You click button 1", Toast.LENGTH_SHORT).show();
                actionStart(FirstActivity.this, SecondActivity.class, null);
            }
        });

        Button btnMain = (Button)findViewById(R.id.button_main);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionStart(FirstActivity.this, MainActivity.class, null);
            }
        });

        ((Button)findViewById(R.id.button_listView)).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "click add item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "click remove item", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_listView:
//                actionStart(this, ListViewActivity.class, null);
                actionStart(this, ListViewActivity2.class, null);
                break;
        }
    }
}