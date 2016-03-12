package com.android.activitytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.activitytest.vo.FruitVo;

import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 */
public class FruitAdapter extends ArrayAdapter<FruitVo> {

    private int resourceId;


    public FruitAdapter(Context context, int resource, List<FruitVo> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent){
        FruitVo fruitVo = getItem(position);
        View view;
        if(contentView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        } else {
            view = contentView;
        }
        ((ImageView)view.findViewById(R.id.fruit_image)).setImageResource(fruitVo.getImageId());
        ((TextView)view.findViewById(R.id.fruit_name)).setText(fruitVo.getName());

        return  view;
    }


}
