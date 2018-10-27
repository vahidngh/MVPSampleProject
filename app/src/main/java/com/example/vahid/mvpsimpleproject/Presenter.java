package com.example.vahid.mvpsimpleproject;

import com.example.vahid.mvpsimpleproject.extra.BasePresenter;

public class Presenter extends BasePresenter{

    private InterfaceManager.View view;
    private InterfaceManager.Model model;


    public Presenter(InterfaceManager.View view, InterfaceManager.Model model) {
        this.view = view;
        this.model = model;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        setData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void setData(){
        view.showLog(model.data());
    }
}
