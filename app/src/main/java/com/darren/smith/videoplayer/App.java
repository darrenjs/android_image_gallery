package com.darren.smith.videoplayer;

import android.app.Application;

import com.darren.smith.videoplayer.di.JavaAppKoinKt;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //init dependency injection
        JavaAppKoinKt.init(this);
    }
}
