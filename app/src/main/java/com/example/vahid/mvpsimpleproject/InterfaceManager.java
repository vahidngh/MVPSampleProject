package com.example.vahid.mvpsimpleproject;

public interface InterfaceManager {
    interface View {
        public void showLog(String str);
    }

    interface Model {
        public String data();
    }
}
