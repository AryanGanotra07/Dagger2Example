package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.DieselEngine;
import com.aryanganotra.daggerexample.Car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    int horsePower;

    public DieselEngineModule(int horsePower)
    {
        this.horsePower = horsePower;
    }

    @Provides
     Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
