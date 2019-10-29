package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Car;
import com.aryanganotra.daggerexample.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);
}
