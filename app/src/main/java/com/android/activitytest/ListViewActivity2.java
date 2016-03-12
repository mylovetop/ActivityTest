package com.android.activitytest;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.activitytest.base.BaseActivity;
import com.android.activitytest.vo.FruitVo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 */
public class ListViewActivity2 extends BaseActivity {

    private static String[] data = {"test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9", "test10"};
    private List<FruitVo> fruitVos = new ArrayList<FruitVo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        initFruitVo();
        FruitAdapter adapter = new FruitAdapter(this, android.R.layout.simple_list_item_1, fruitVos);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FruitVo fruitVo = fruitVos.get(position);
                Toast.makeText(ListViewActivity2.this, fruitVo.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruitVo(){
        FruitVo fruitVo = new FruitVo("Apple", 1);
        fruitVos.add(fruitVo);
    }
}
