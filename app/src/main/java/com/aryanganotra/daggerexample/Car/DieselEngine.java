package com.aryanganotra.daggerexample.Car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine  {

    private static final String TAG = "Car";
    int horsePower;

    @Inject
    public DieselEngine(int horsePower)
    {
        this.horsePower = horsePower;
    }


    @Override
    public void start() {
        Log.d(TAG, "Diesal engine started..");
    }
}
