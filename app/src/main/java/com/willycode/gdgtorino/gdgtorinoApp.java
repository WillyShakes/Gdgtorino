package com.willycode.gdgtorino;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Manuel ELO'O on 03/05/2016.
 */
public class gdgtorinoApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
