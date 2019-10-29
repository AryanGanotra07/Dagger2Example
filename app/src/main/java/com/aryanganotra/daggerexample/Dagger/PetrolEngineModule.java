package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Engine;
import com.aryanganotra.daggerexample.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract  class PetrolEngineModule {


    @Binds
    abstract Engine provideEngine(PetrolEngine engine);

}
