package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = DriverModule.class)
@Singleton
public interface AppComponent {


    Driver getDriver();
}
