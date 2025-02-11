package com.aryanganotra.daggerexample.Car;

import android.util.Log;

import com.aryanganotra.daggerexample.Dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

@Inject
    public Car(Engine engine, Wheels wheels, Driver driver)
    {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;

    }

    public void drive(){
        Log.d(TAG, "driving...");
    }

    @Inject
    public void enableRemote(Remote remote)
    {
        remote.setListener(this);
    }
}
