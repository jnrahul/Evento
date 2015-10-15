package com.eventhub.evento;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Rats on 10/15/2015.
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());

    }
}
