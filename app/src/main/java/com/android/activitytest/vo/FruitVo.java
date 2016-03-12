package com.android.activitytest.vo;

/**
 * Created by Administrator on 2016/1/15.
 */
public class FruitVo {

    private String name;
    private int imageId;

    public FruitVo(String name, int image){
        this.name = name;
        this.imageId = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImage(int imageId) {
        this.imageId = imageId;
    }
}
