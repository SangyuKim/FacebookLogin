package com.example.tacademy.myapplication;

import android.app.Application;
import android.content.Context;

import com.facebook.FacebookSdk;

/**
 * Created by Tacademy on 2015-10-27.
 */
public class MyApplication extends Application {
    Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        // Initialize the SDK before executing any other operations,
        // especially, if you're using Facebook UI elements

    }
}
