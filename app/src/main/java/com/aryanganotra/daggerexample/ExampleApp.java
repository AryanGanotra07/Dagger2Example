package com.aryanganotra.daggerexample;

import android.app.Application;

import com.aryanganotra.daggerexample.Dagger.ActivityComponent;
import com.aryanganotra.daggerexample.Dagger.AppComponent;
import com.aryanganotra.daggerexample.Dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        component  = DaggerAppComponent.create();

    }

    public AppComponent getComponent()
    {
        return component;
    }
}
