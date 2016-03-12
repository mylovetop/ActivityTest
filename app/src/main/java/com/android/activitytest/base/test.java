//package com.android.activitytest.base;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Bundle;
//import android.text.style.BackgroundColorSpan;
//import android.util.Log;
//import android.view.Gravity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.Window;
//import android.widget.Button;
//import android.widget.FrameLayout;
//import android.widget.LinearLayout;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//
//
//import com.android.activitytest.R;
//import com.android.activitytest.util.ActivityCollector;
//import com.android.activitytest.util.IntentDataVo;
//
///**
// * Created by Administrator on 2016/1/14.
// */
//public class BaseActivity extends Activity implements View.OnClickListener {
//
//    private Context context;
//
//    protected final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
//    protected final int MATCH_PARENT = ViewGroup.LayoutParams.MATCH_PARENT;
//
//    protected LinearLayout.LayoutParams getLinearLayoutParams(int width, int height){
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
//        return layoutParams;
//    }
//
//    protected LinearLayout.LayoutParams getLinearLayoutParams(int width, int height, int weight){
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height, weight);
//        return layoutParams;
//    }
//
//    protected FrameLayout.LayoutParams getFrameLayoutParams(int width, int height){
//        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
//        return layoutParams;
//    }
//
//    public Context getContext() {
//        return context;
//    }
//
//    public void setContext(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        Log.d("BaseActivity", getClass().getSimpleName());
//        ActivityCollector.addActivity(this);
//    }
//
//
//
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        ActivityCollector.removeActivity(this);//81
//    }
//
//    public static void actionStart(Context context,  Class clazz, IntentDataVo intentDataVo){
//        Intent intent = new Intent(context, clazz);
//        intent.putExtra("intentDataVo", intentDataVo.toJson());
//        context.startActivity(intent);
//    }
//
//    @Override
//    public void onClick(View v) {
//
//    }
//
//    public void showAlertDialog(String title, String message){
//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle(title);
//        dialog.setMessage(message);
////        dialog
//    }
//
//
//    /**
//     * ====================================================================================================
//     * 初始化头部导航栏
//     * ====================================================================================================
//     */
//    private LinearLayout headerView;
//
//    private final String msgContext = "context can not null";
//    private final String msgHeaderView = "header view can not null";
//    private final int btnWidth = 40;
//
//    protected void initHeaderTitle() {
//
//        TextView title = new TextView(BaseActivity.this);
//        title.setText("标题");
////        title.setBackgroundColor(Color.RED);
//        title.setGravity(Gravity.CENTER);
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(MATCH_PARENT, MATCH_PARENT,1);
//
//
//        layoutParams.gravity = Gravity.CENTER_HORIZONTAL;
//        title.setLayoutParams(layoutParams);
//        headerView.addView(title);
//    }
//
//
//    protected void initHeaderLeftView() {
//        Button leftBtn = new Button(BaseActivity.this);
//        LinearLayout.LayoutParams layoutParams =getLinearLayoutParams(this.WRAP_CONTENT, MATCH_PARENT);
//        leftBtn.setLayoutParams(layoutParams);
//        leftBtn.setWidth(btnWidth);
//        leftBtn.setText("返回");
//        headerView.addView(leftBtn);
//    }
//
//
//    protected void initHeaderRightView() {
//        Button rightBtn = new Button(BaseActivity.this);
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(this.WRAP_CONTENT, MATCH_PARENT);
//        rightBtn.setLayoutParams(layoutParams);
//        rightBtn.setWidth(btnWidth);
//        rightBtn.setText("确定");
//
//        headerView.addView(rightBtn);
//    }
//
//
//    protected LinearLayout initHeaderView() {
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(MATCH_PARENT, WRAP_CONTENT);
//        headerView = new LinearLayout(BaseActivity.this);
//        headerView.setLayoutParams(layoutParams);
//        headerView.setOrientation(LinearLayout.HORIZONTAL);
//
//        this.initHeaderLeftView();
//        this.initHeaderTitle();
//        this.initHeaderRightView();
//        return headerView;
//    }
//
//    /**
//     * ====================================================================================================
//     * 初始化bodyView
//     * ====================================================================================================
//     */
//    protected FrameLayout frameLayout;
//
//    protected FrameLayout initBodyView(){
//        frameLayout = new FrameLayout(BaseActivity.this);
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(MATCH_PARENT, 0, 1);
//        frameLayout.setLayoutParams(layoutParams);
//        frameLayout.setBackgroundColor(BackgroundColorSpan.CONTENTS_FILE_DESCRIPTOR);
//        frameLayout.setBackgroundColor(Color.BLUE);
//        this.initBodyContent();
//        return frameLayout;
//    }
//
//    protected void initBodyContent(){
//
//
//
//    }
//
//    /**
//     * ====================================================================================================
//     * 初始化footer导航栏
//     * ====================================================================================================
//     */
//    private RadioGroup footerView;
//    protected enum ENUM_FOOTER_VIEW{
//        ONE(100, "首页"),
//        TWO(101,"发现"),
//        THREE(102,  "消息"),
//        FOUR(103, "我");
//        private int id;
//        private String name;
//        private ENUM_FOOTER_VIEW(int id, String name){
//            this.id = id;
//            this.name = name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//
//
//
//    }
//
//    protected RadioGroup  initFooterView(){
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(MATCH_PARENT, WRAP_CONTENT);
//        footerView = new RadioGroup(BaseActivity.this);
//        footerView.setLayoutParams(layoutParams);
//        footerView.setOrientation(RadioGroup.HORIZONTAL);
//
////        footerView.addView(initFooterItemView(ENUM_FOOTER_VIEW.ONE.getId(), ENUM_FOOTER_VIEW.ONE.getName(), true));
////        footerView.addView(initFooterItemView(ENUM_FOOTER_VIEW.TWO.getId(), ENUM_FOOTER_VIEW.TWO.getName(), false));
////        footerView.addView(initFooterItemView(ENUM_FOOTER_VIEW.THREE.getId(), ENUM_FOOTER_VIEW.THREE.getName(), false));
////        footerView.addView(initFooterItemView(ENUM_FOOTER_VIEW.FOUR.getId(), ENUM_FOOTER_VIEW.FOUR.getName(), false));
//
//        initFooterItemView(ENUM_FOOTER_VIEW.ONE.getId(), ENUM_FOOTER_VIEW.ONE.getName(), true);
//        return footerView;
//    }
//
//    protected RadioButton initFooterItemView(int id, String text, Boolean checked){
//        RadioButton itemView = new RadioButton(BaseActivity.this);
////        itemView.setId(id);
//        itemView.setText(text);
//        itemView.setChecked(checked);
////        itemView.setButtonDrawable(null);
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(0, WRAP_CONTENT, 1);
//        itemView.setLayoutParams(layoutParams);
//        itemView.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
//        footerView.addView(itemView);
//        return itemView;
//    }
//
//    protected LinearLayout builder(){
//        LinearLayout.LayoutParams layoutParams = getLinearLayoutParams(MATCH_PARENT, MATCH_PARENT);
//        LinearLayout view = new LinearLayout(BaseActivity.this);
//        view.setOrientation(LinearLayout.VERTICAL);
//        //header
//        view.addView(initHeaderView());
//        //body
//        view.addView(initBodyView());
//        //footer
//        view.addView(initFooterView());
//        return view;
//    }
//
//}
