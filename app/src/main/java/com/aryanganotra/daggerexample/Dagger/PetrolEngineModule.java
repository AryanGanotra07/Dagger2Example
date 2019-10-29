package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Engine;
import com.aryanganotra.daggerexample.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class PetrolEngineModule {
    int horsePower;

    public PetrolEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
     Engine provideEngine()
    {
        return new PetrolEngine(horsePower);
    }
}
