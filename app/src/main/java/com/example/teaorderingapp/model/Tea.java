package com.example.teaorderingapp.model;

public class Tea {
    private String mTeaName;
    private int mImageResourceId;

    public Tea(String mTeaName, int mImageResourceId) {
        this.mTeaName = mTeaName;
        this.mImageResourceId = mImageResourceId;
    }

    public String getTeaName() {
        return mTeaName;
    }



    public int getImageResourceId() {
        return mImageResourceId;
    }


}
