package com.android.activitytest.rootactivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.activitytest.R;
import com.android.activitytest.base.BaseActivity;
import com.android.activitytest.base.BaseFragment;

/**
 * Created by Administrator on 2016/1/20.
 */
public class RootActivityMain extends BaseActivity implements View.OnClickListener{

    private RootActivityOne rootActivityOne;
    private RootActivityTwo rootActivityTwo;
    private RootActivityThree rootActivityThree;
    private RootActivityFour rootActivityFour;

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    private RadioGroup radioGroup;

    private int mainFrameLayout;

    private BaseFragment fromFragment;
    private BaseFragment toFragment;
    private BaseFragment currentFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root_activity_main);
//        setContentView(builder());
        initRootActivityOne();
        onClickRadioGroup();
    }

    private void initRootActivityOne(){
        if (rootActivityOne == null) {
            rootActivityOne = new RootActivityOne();

        }
        switchContent(currentFragment, rootActivityOne);
    }

    /**
     * 导航栏点击事件
     */
    private void onClickRadioGroup(){
        radioGroup = (RadioGroup)findViewById(R.id.rootActivityMainRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.rootActivityOne:
                        if (rootActivityOne == null) {
                            rootActivityOne = new RootActivityOne();

                        }
                        switchContent(currentFragment, rootActivityOne);

                        break;
                    case R.id.rootActivityTwo:
                        if (rootActivityTwo == null) {
                            rootActivityTwo = new RootActivityTwo();
//                            initRootActivity(rootActivityTwo);
                        } else {
//                            showRootActivity(rootActivityTwo);
                        }
                        switchContent(currentFragment, rootActivityTwo);
                        break;
                    case R.id.rootActivityThree:
                        if (rootActivityThree == null) {
                            rootActivityThree = new RootActivityThree();
//                            initRootActivity(rootActivityThree);
                        } else {
//                            showRootActivity(rootActivityThree);
                        }
                        switchContent(currentFragment, rootActivityThree);

                        break;
                    case R.id.rootActivityFour:
                        if (rootActivityFour == null) {
                            rootActivityFour = new RootActivityFour();
//                            initRootActivity(rootActivityFour);
                        } else {
//                            showRootActivity(rootActivityFour);
                        }
                        switchContent(currentFragment, rootActivityFour);
                    default:
//                        initRootActivity(rootActivityOne);
                }

            }
        });
    }



    private void initRootActivity(BaseFragment baseFragment){

        if(fragmentManager == null) {
            fragmentManager = getFragmentManager();
        }
        transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.rootActivityMainFrameLayout, baseFragment);
        transaction.add(R.id.rootActivityMainFrameLayout, baseFragment);
        transaction.commit();
    }

    private void showRootActivity(BaseFragment baseFragment){
        transaction = fragmentManager.beginTransaction();
        transaction.show(baseFragment);
        transaction.commit();
    }

    public void switchContent(BaseFragment fromFragment, BaseFragment toFragment) {
        if (currentFragment != toFragment) {
            if(fragmentManager == null) {
                fragmentManager = getFragmentManager();
            }
            currentFragment = toFragment;
            transaction = fragmentManager.beginTransaction();
            if (!toFragment.isAdded()) {
                // 先判断是否被add过
                if(fromFragment != null){
                    transaction.hide(fromFragment).add(R.id.rootActivityMainFrameLayout, toFragment).commit(); // 隐藏当前的fragment，add下一个到Activity中
                } else {
                    transaction.add(R.id.rootActivityMainFrameLayout, toFragment).commit(); // 隐藏当前的fragment，add下一个到Activity中
                }

            } else {
                if(fromFragment != null) {
                    transaction.hide(fromFragment).show(toFragment).commit(); // 隐藏当前的fragment，显示下一个
                } else {
                    transaction.show(toFragment).commit(); // 隐藏当前的fragment，显示下一个
                }
            }
        }
    }

    @Override
    public void onClick(View v){

    }

}
