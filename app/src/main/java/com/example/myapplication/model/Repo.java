package com.example.myapplication.model;

import android.os.Handler;

public class Repo {

    private static Repo mInstance;
    private Letter mLetter;

    public Repo() {
        Letter mLetter = new Letter("Programming", "dchjuasdlcuhdkjcbDGFCcbdsc" +
                "dshjbdsjh.ckjb.kjsdc" +
                "sdcbsCSdckjbcdsdvcbns dv sufhADSHnjbfusHFwe fyDE F fu");
    }

    public static Repo getmInstance() {
        if (mInstance == null)
            mInstance = new Repo();
        return mInstance;
    }

    public void getRequest(final MyCallback<Letter> callback) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onSucessful(mLetter);
            }
        }, 2000);
    }
}
