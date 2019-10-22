package com.example.myapplication.model;

public class Letter {
    private String mTitle, mSub;

    public Letter(String title, String sub) {
        mTitle = title;
        mSub = sub;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSub() {
        return mSub;
    }

    public void setSub(String sub) {
        mSub = sub;
    }
}
