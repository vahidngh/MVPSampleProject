package com.example.vahid.mvpsimpleproject;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class View implements InterfaceManager.View {

    @Override
    public void showLog(String data) {
        Log.i(TAG,data);
    }

}
