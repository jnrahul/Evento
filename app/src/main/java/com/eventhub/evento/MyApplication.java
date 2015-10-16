package com.eventhub.evento;

import android.app.Application;
import com.digits.sdk.android.Digits;
import com.facebook.FacebookSdk;
import com.crashlytics.android.Crashlytics;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import io.fabric.sdk.android.Fabric;

public class MyApplication extends Application
{

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "xfkpw4qHdC4Ib86j3heMs4tfv";
    private static final String TWITTER_SECRET = "Pjfw6yUXuM5uxbeBxrzDTA4tJBerjCMe6VvctUKR1jFqy8rJDm";

    @Override
    public void onCreate()
    {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Crashlytics(), new TwitterCore(authConfig), new Digits());
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
