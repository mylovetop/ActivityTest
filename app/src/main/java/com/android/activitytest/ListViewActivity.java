package com.android.activitytest;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.activitytest.base.BaseActivity;

/**
 * Created by Administrator on 2016/1/15.
 */
public class ListViewActivity extends BaseActivity {

    private static String[] data = {"test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9", "test10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
