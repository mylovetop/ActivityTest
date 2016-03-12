package com.android.activitytest.rootactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.activitytest.R;
import com.android.activitytest.base.BaseActivity;
import com.android.activitytest.base.BaseFragment;

/**
 * Created by Administrator on 2016/1/20.
 */
public class RootActivityFour extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.root_activity_four, container, false);
        return view;
    }
}
