package com.example.callbacktest;


public class callbackTestClass {
    public callbackTestClass(){

    }

    public void callbackMethod(callbackTestInterface listener){
        listener.btnClicked();
    }
}
