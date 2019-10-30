package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    private String name;
    public DriverModule(String name) {
        this.name = name;
    }


    @Provides
    @Singleton
     Driver provideDriver()
    {
        return new Driver(name);
    }

}
